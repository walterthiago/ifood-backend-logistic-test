package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.OrderRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @PostMapping
    public ResponseEntity<OrderResponse> create(OrderRequest request) {
        return null;
    }

    @GetMapping
    public ResponseEntity<Collection<OrderResponse>> getAll() {
        return null;
    }

    @GetMapping(path = "/{orderId}")
    public ResponseEntity<OrderResponse> getById() {
        return null;
    }

    @PutMapping(path = "/{orderId}")
    public ResponseEntity<OrderResponse> update(OrderRequest request) {
        return null;
    }
}
