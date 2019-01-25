package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private Long id;
    private RestaurantEntity restaurant;
    private ClientEntity client;
    private LocalDateTime pickup;
    private LocalDateTime delivery;
}
