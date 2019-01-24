package br.com.ifood.ibtlvrptest.ibtlvrptest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @PostMapping
    public String create() {
        return "";
    }

    @GetMapping
    public String getAll() {
        return "";
    }

    @GetMapping(path = "/{orderId}")
    public String getById() {
        return "";
    }

    @PutMapping(path = "/{orderId}")
    public String update() {
        return "";
    }
}
