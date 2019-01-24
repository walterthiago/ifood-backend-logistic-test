package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.RestaurantRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.RestaurantResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public ResponseEntity<RestaurantResponse> create(RestaurantRequest request) {
        return null;
    }

    @GetMapping
    public ResponseEntity<Collection<RestaurantResponse>> getAll() {
        return null;
    }

    @GetMapping(path = "/{restaurantId}")
    public ResponseEntity<RestaurantResponse> getById() {
        return null;
    }

    @PutMapping(path = "/{restaurantId}")
    public ResponseEntity<RestaurantResponse> update(RestaurantRequest request) {
        return null;
    }

}
