package com.pedidos.trefelt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "gap_id")
    private Gap gap;
    private List<Product> references;
}
