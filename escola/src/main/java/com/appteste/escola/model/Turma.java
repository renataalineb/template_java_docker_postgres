package com.appteste.escola.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_turm;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "turma")
    private Set<Aluno> alunos;

    @ManyToMany
    @JoinTable(
            name = "professor_turma",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "id_prof")
    )
    private Set<Professor> professores;
}
