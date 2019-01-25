package br.com.ifood.ibtlvrptest.ibtlvrptest.mappers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.OrderRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.OrderResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.OrderEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper instance = Mappers.getMapper(OrderMapper.class);

    Order requestToOrder(OrderRequest order);

    Order entityToOrder(OrderEntity order);

    OrderEntity orderToEntity(Order order);

    OrderResponse orderToResponse(Order order);

}
