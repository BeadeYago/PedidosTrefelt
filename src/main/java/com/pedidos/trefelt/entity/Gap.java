package com.pedidos.trefelt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Gap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "gap")
    private List<Station> station;

}
