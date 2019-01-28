package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientRequest {

    private Long id;

    @NotNull(message = "'lat' field is required")
    private Double lat;

    @NotNull(message = "'lon' field is required")
    private Double lon;

}
