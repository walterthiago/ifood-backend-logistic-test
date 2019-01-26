package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers;

import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request.RestaurantRequest;
import br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response.RestaurantResponse;
import br.com.ifood.ibtlvrptest.ibtlvrptest.mappers.RestaurantMapper;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.RestaurantService;
import br.com.ifood.ibtlvrptest.ibtlvrptest.services.models.Restaurant;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public ResponseEntity<RestaurantResponse> create(@RequestBody RestaurantRequest request) {
        val created = restaurantService.create(toRestaurant(request));
        return ResponseEntity.ok(toResponse(created));
    }

    @GetMapping
    public ResponseEntity<Collection<RestaurantResponse>> getAll() {
        val restaurants = restaurantService
                .retrieveAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(restaurants);
    }

    @GetMapping(path = "/{restaurantId}")
    public ResponseEntity<RestaurantResponse> getById(@PathVariable("restaurantId") Long id) {
        val found = restaurantService.retrieveById(id);
        return ResponseEntity.ok(toResponse(found));
    }

    @PutMapping(path = "/{restaurantId}")
    public ResponseEntity<RestaurantResponse> update(@PathVariable("restaurantId") Long id, @RequestBody RestaurantRequest request) {
        val updated = restaurantService.update(id, toRestaurant(request));
        return ResponseEntity.ok(toResponse(updated));
    }

    private Restaurant toRestaurant(RestaurantRequest restaurant) {
        return RestaurantMapper.instance.requestToRestaurant(restaurant);
    }

    private RestaurantResponse toResponse(Restaurant restaurant) {
        return RestaurantMapper.instance.restaurantToResponse(restaurant);
    }

}
