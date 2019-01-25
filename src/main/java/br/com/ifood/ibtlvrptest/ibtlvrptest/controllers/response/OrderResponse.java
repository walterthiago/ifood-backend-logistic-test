package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;

import java.time.LocalDateTime;

public class OrderResponse {
    private Long id;
    private RestaurantEntity restaurant;
    private ClientEntity client;
    private LocalDateTime pickup;
    private LocalDateTime delivery;
}
