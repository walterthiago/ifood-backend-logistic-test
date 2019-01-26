package br.com.ifood.ibtlvrptest.ibtlvrptest.services.impl;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.exceptions.ResourceNotFoundException;
import br.com.ifood.ibtlvrptest.ibtlvrptest.mappers.RestaurantMapper;
import br.com.ifood.ibtlvrptest.ibtlvrptest.repositories.RestaurantRepository;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.RestaurantService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Restaurant;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    @Override
    public Restaurant create(Restaurant restaurant) {
        val entity = toEntity(restaurant);
        val saved = repository.save(entity);
        return toRestaurant(saved);
    }

    @Override
    public Collection<Restaurant> retrieveAll() {
        val restaurants = repository.findAll();
        return StreamSupport.stream(restaurants.spliterator(), false)
                .map(this::toRestaurant)
                .collect(Collectors.toList());
    }

    @Override
    public Restaurant retrieveById(Long id) {
        val found = repository.findById(id).orElseThrow(ResourceNotFoundException::new);
        return toRestaurant(found);
    }

    @Override
    public Restaurant update(Long id, Restaurant restaurant) {
        val found = this.retrieveById(id);

        found.setLat(restaurant.getLat());
        found.setLon(restaurant.getLon());

        val updated = repository.save(toEntity(found));
        return toRestaurant(updated);
    }

    private RestaurantEntity toEntity(Restaurant restaurant) {
        return RestaurantMapper.instance.restaurantToEntity(restaurant);
    }

    private Restaurant toRestaurant(RestaurantEntity entity) {
        return RestaurantMapper.instance.entityToRestaurant(entity);
    }
}
