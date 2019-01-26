package br.com.ifood.ibtlvrptest.ibtlvrptest.services.models;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Long id;
    private RestaurantEntity restaurant;
    private ClientEntity client;
    private LocalDateTime pickup;
    private LocalDateTime delivery;
}
