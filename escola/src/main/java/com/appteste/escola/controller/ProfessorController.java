package com.appteste.escola.controller;

import com.appteste.escola.model.Professor;
import com.appteste.escola.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> findAll() {
        return professorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> findById(@PathVariable Long id) {
        Optional<Professor> professor = professorService.findById(id);
        return professor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Professor save(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        professorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/nome/{nome}")
    public ResponseEntity<Void> deleteByNome(@PathVariable String nome) {
        professorService.deleteByNome(nome);
        return ResponseEntity.noContent().build();
    }
}
