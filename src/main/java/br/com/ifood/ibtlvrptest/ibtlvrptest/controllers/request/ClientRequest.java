package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientRequest {
    private Long id;
    private Double lat;
    private Double lon;
}
