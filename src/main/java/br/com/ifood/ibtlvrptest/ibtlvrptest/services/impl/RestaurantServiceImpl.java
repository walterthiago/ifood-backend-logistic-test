package br.com.ifood.ibtlvrptest.ibtlvrptest.services.impl;

import br.com.ifood.ibtlvrptest.ibtlvrptest.services.RestaurantService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Restaurant;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public Restaurant create(Restaurant restaurant) {
        return null;
    }

    @Override
    public Collection<Restaurant> retrieveAll() {
        return null;
    }

    @Override
    public Restaurant retrieveById(Long id) {
        return null;
    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        return null;
    }
}
