package com.appteste.escola.controller;

import com.appteste.escola.model.Turma;
import com.appteste.escola.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> findAll() {
        return turmaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Long id) {
        Optional<Turma> turma = turmaService.findById(id);
        return turma.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Turma save(@RequestBody Turma turma) {
        return turmaService.save(turma);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        turmaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
