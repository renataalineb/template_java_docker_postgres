package com.appteste.escola.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prof;

    @Column(nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "professores")
    private List<Turma> turmas;

    public Long getId_prof() {
        return id_prof;
    }

    public void setId_prof(Long id_prof) {
        this.id_prof = id_prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
