package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderResponse {
    private Long id;
    private RestaurantEntity restaurant;
    private ClientEntity client;
    private LocalDateTime pickup;
    private LocalDateTime delivery;
}
