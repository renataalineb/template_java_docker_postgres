package com.appteste.escola.repository;

import com.appteste.escola.model.Professor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    @Transactional
    void deleteByNome(String nome);
}
