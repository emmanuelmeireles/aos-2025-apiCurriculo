package com.example.apicurriculo.service;

import com.example.apicurriculo.model.Curriculum;
import com.example.apicurriculo.repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculumService {

    @Autowired
    private CurriculumRepository curriculumRepository;

    public Curriculum saveCurriculum(Curriculum curriculum) {
        return curriculumRepository.save(curriculum);
    }

    public Optional<Curriculum> getCurriculumById(Long id) {
        return curriculumRepository.findById(id);
    }

    public List<Curriculum> getAllCurriculums() {
        return curriculumRepository.findAll();
    }

    public void deleteCurriculum(Long id) {
        curriculumRepository.deleteById(id);
    }
}