package br.com.ifood.ibtlvrptest.ibtlvrptest.controllers.response;

import lombok.Data;

@Data
public class RestaurantResponse {
    private Long id;
    private Double lat;
    private Double lon;
}
