package com.example.apicurriculo.controller;

import com.example.apicurriculo.model.Curriculum;
import com.example.apicurriculo.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculums")
public class CurriculumController {

    @Autowired
    private CurriculumService curriculumService;

    @PostMapping
    public Curriculum createCurriculum(@RequestBody Curriculum curriculum) {
        return curriculumService.saveCurriculum(curriculum);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculum> getCurriculumById(@PathVariable Long id) {
        return curriculumService.getCurriculumById(id)
                .map(ResponseEntity::ok) // Retorna 200 OK com o currículo
                .orElse(ResponseEntity.notFound().build()); // Retorna 404 Not Found se não encontrado
    }

    @GetMapping
    public List<Curriculum> getAllCurriculums() {
        return curriculumService.getAllCurriculums();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurriculum(@PathVariable Long id) {
        curriculumService.deleteCurriculum(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content
    }
}