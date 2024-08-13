package com.appteste.escola.controller;

import com.appteste.escola.model.Presenca;
import com.appteste.escola.service.PresencaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/presencas")
public class PresencaController {

    @Autowired
    private PresencaService presencaService;

    @GetMapping
    public List<Presenca> findAll() {
        return presencaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Presenca> findById(@PathVariable Long id) {
        Optional<Presenca> presenca = presencaService.findById(id);
        return presenca.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Presenca save(@RequestBody Presenca presenca) {
        return presencaService.save(presenca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        presencaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}


