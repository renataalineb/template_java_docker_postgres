package com.appteste.escola.model;

import jakarta.persistence.*;

@Entity
public class Presenca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long presen_id;

    @ManyToOne
    @JoinColumn(name = "chamada_id", nullable = false)
    private Chamada chamada;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(nullable = false)
    private Boolean presente;

}
