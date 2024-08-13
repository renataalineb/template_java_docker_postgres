package com.appteste.escola.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Chamada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cha;

    @Column(nullable = false)
    private Date data;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

}
