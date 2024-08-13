package com.appteste.escola.service;

import com.appteste.escola.model.Presenca;
import com.appteste.escola.repository.PresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PresencaService {
    @Autowired
    private PresencaRepository presencaRepository;

    public List<Presenca> findAll() {
        return presencaRepository.findAll();
    }

    public Optional<Presenca> findById(Long id) {
        return presencaRepository.findById(id);
    }

    public Presenca save(Presenca presenca) {
        return presencaRepository.save(presenca);
    }

    public void deleteById(Long id) {
        presencaRepository.deleteById(id);
    }
}
