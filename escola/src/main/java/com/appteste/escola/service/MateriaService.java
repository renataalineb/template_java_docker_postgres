package com.appteste.escola.service;

import com.appteste.escola.model.Materia;
import com.appteste.escola.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    public Optional<Materia> findById(Long id) {
        return materiaRepository.findById(id);
    }

    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    public void deleteById(Long id) {
        materiaRepository.deleteById(id);
    }
}
