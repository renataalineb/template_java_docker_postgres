package com.appteste.escola.controller;

import com.appteste.escola.model.Chamada;
import com.appteste.escola.service.ChamadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chamadas")
public class ChamadaController {
    @Autowired
    private ChamadaService chamadaService;

    @GetMapping
    public List<Chamada> findAll() {
        return chamadaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chamada> findById(@PathVariable Long id) {
        Optional<Chamada> chamada = chamadaService.findById(id);
        return chamada.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Chamada save(@RequestBody Chamada chamada) {
        return chamadaService.save(chamada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        chamadaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
