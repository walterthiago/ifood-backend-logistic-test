package br.com.ifood.ibtlvrptest.ibtlvrptest.services;

import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Order;

import java.util.Collection;

public interface OrderService {

    Order create(Order order);

    Collection<Order> retrieveAll();

    Order retrieveById(Long id);

    Order update(Long id, Order order);

}
