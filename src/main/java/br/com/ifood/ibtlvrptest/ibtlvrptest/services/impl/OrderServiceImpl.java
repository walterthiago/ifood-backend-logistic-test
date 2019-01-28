package br.com.ifood.ibtlvrptest.ibtlvrptest.services.impl;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.OrderEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.exceptions.ResourceNotFoundException;
import br.com.ifood.ibtlvrptest.ibtlvrptest.mappers.OrderMapper;
import br.com.ifood.ibtlvrptest.ibtlvrptest.repositories.OrderRepository;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.OrderService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Order;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order create(Order order) {
        val entity = toEntity(order);
        val saved = repository.save(entity);
        return toOrder(saved);
    }

    @Override
    public Collection<Order> retrieveAll() {
        val orders = repository.findAll();
        return StreamSupport.stream(orders.spliterator(), false)
                .map(this::toOrder)
                .collect(Collectors.toList());
    }

    @Override
    public Order retrieveById(Long id) {
        val found = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order " + id + " not found"));
        return toOrder(found);
    }

    @Override
    public Order update(Long id, Order order) {
        val found = this.retrieveById(id);

        found.setPickup(order.getPickup());
        found.setDelivery(order.getDelivery());

        val updated = repository.save(toEntity(found));
        return toOrder(updated);
    }

    private OrderEntity toEntity(Order order) {
        return OrderMapper.instance.orderToEntity(order);
    }

    private Order toOrder(OrderEntity entity) {
        return OrderMapper.instance.entityToOrder(entity);
    }
}
