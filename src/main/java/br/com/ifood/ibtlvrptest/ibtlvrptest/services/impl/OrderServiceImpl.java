package br.com.ifood.ibtlvrptest.ibtlvrptest.services.impl;

import br.com.ifood.ibtlvrptest.ibtlvrptest.services.OrderService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Order;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order create(Order order) {
        return null;
    }

    @Override
    public Collection<Order> retrieveAll() {
        return null;
    }

    @Override
    public Order retrieveById(Long id) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }
}
