package com.appteste.escola.controller;

import com.appteste.escola.model.Materia;
import com.appteste.escola.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> findAll() {
        return materiaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> findById(@PathVariable Long id) {
        Optional<Materia> materia = materiaService.findById(id);
        return materia.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Materia save(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        materiaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
