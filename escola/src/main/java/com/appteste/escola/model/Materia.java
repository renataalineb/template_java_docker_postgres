package com.appteste.escola.model;

import jakarta.persistence.*;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mat;

    @Column(nullable = false)
    private String nome;

}
