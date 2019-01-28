package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.OrderRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.OrderResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.mappers.OrderMapper;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.OrderService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Order;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> create(@Valid @RequestBody OrderRequest request) {
        val created = orderService.create(toOrder(request));
        return ResponseEntity.ok(toResponse(created));
    }

    @GetMapping
    public ResponseEntity<Collection<OrderResponse>> getAll() {
        val orders = orderService
                .retrieveAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(orders);
    }

    @GetMapping(path = "/{orderId}")
    public ResponseEntity<OrderResponse> getById(@PathVariable("orderId") Long id) {
        val found = orderService.retrieveById(id);
        return ResponseEntity.ok(toResponse(found));
    }

    @PutMapping(path = "/{orderId}")
    public ResponseEntity<OrderResponse> update(@PathVariable("orderId") Long id, @Valid @RequestBody OrderRequest request) {
        val updated = orderService.update(id, toOrder(request));
        return ResponseEntity.ok(toResponse(updated));
    }

    private Order toOrder(OrderRequest order) {
        return OrderMapper.instance.requestToOrder(order);
    }

    private OrderResponse toResponse(Order order) {
        return OrderMapper.instance.orderToResponse(order);
    }
}
