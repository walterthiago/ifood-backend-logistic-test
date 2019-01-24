package br.com.ifood.ibtlvrptest.ibtlvrptest.mappers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.RestaurantRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.RestaurantResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper instance = Mappers.getMapper(RestaurantMapper.class);

    RestaurantEntity requestToEntity(RestaurantRequest restaurant);

    RestaurantResponse entityToResponse(RestaurantEntity restaurant);

}
