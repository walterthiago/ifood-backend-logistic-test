package br.com.ifood.ibtlvrptest.ibtlvrptest.services;

import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Restaurant;

import java.util.Collection;

public interface RestaurantService {

    Restaurant create(Restaurant restaurant);

    Collection<Restaurant> retrieveAll();

    Restaurant retrieveById(Long id);

    Restaurant update(Long id, Restaurant restaurant);
}
