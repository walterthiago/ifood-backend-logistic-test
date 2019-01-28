package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request;

import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.ClientEntity;
import br.com.ifood.ibtlvrptest.ibtlvrptest.entities.RestaurantEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private Long id;

    @NotNull
    private RestaurantEntity restaurant;

    @NotNull
    private ClientEntity client;

    @NotNull
    private LocalDateTime pickup;

    @NotNull
    private LocalDateTime delivery;

}
