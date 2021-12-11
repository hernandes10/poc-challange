package com.pocchallenge.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "valor")
@Getter
@Setter
public class Valor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private Double number;

    public Valor(Double number) {
        this.number = number;
    }
}
