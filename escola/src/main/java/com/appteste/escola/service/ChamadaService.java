package com.appteste.escola.service;

import com.appteste.escola.model.Chamada;
import com.appteste.escola.repository.ChamadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChamadaService {

    @Autowired
    private ChamadaRepository chamadaRepository;

    public List<Chamada> findAll() {
        return chamadaRepository.findAll();
    }

    public Optional<Chamada> findById(Long id) {
        return chamadaRepository.findById(id);
    }

    public Chamada save(Chamada chamada) {
        return chamadaRepository.save(chamada);
    }

    public void deleteById(Long id) {
        chamadaRepository.deleteById(id);
    }
}
