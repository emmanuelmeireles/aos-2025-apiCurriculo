package com.example.CurriculoApi.service;

import com.example.CurriculoApi.model.Curriculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CurriculoApi.repository.CurriculoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository repository;


    @Autowired
    public CurriculoService(CurriculoRepository curriculoRepository) {
        this.repository = curriculoRepository;
    }

    public Curriculo saveCurriculo(Curriculo curriculo) {
        return repository.save(curriculo);
    }

    public Optional<Curriculo> findCurriculoById(Long id) {
        return repository.findById(id);
    }

    public List<Curriculo> findAllCurriculos() {
        return repository.findAll();
    }

    public void deleteCurriculo(Long id) {
        repository.deleteById(id);
    }
}