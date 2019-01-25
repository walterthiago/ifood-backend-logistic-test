package br.com.ifood.ibtlvrptest.ibtlvrptest.services.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {

    private Long id;
    private Double lat;
    private Double lon;

}
