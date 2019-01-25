package br.com.ifood.ibtlvrptest.ibtlvrptest.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Data
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double lat;
    private Double lon;

}
