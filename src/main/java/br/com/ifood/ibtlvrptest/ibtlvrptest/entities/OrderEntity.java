package br.com.ifood.ibtlvrptest.ibtlvrptest.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private RestaurantEntity restaurant;

    @OneToOne
    private ClientEntity client;

    private LocalDateTime pickup;
    private LocalDateTime delivery;

}
