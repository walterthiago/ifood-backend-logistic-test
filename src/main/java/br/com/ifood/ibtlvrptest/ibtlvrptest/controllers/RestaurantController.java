package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/restaurant")
public class RestaurantController {

    @PostMapping
    public String create() {
        return "";
    }

    @GetMapping
    public String getAll() {
        return "";
    }

    @GetMapping(path = "/{restaurantId}")
    public String getById() {
        return "";
    }

    @PutMapping(path = "/{restaurantId}")
    public String update() {
        return "";
    }

}
