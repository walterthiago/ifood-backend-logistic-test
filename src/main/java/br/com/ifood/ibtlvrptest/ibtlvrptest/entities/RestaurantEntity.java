package br.com.ifood.ibtlvrptest.ibtlvrptest.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="restaurants")
@Data
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Double lat;
    private Double lon;

}
