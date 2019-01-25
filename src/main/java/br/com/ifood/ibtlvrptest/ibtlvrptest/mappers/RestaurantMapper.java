package br.com.ifood.ibtlvrptest.ibtlvrptest.mappers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.RestaurantRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.RestaurantResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper instance = Mappers.getMapper(RestaurantMapper.class);

    Restaurant requestToRestaurant(RestaurantRequest restaurant);

    Restaurant entityToRestaurant(RestaurantEntity restaurant);

    RestaurantEntity restaurantToEntity(Restaurant restaurant);

    RestaurantResponse restaurantToResponse(Restaurant restaurant);

}
