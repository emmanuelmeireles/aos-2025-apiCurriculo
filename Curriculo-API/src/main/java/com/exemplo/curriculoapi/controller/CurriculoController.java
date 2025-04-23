package com.exemplo.curriculoapi.controller;

import com.exemplo.curriculoapi.model.Curriculo;
import com.exemplo.curriculoapi.service.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;

    @PostMapping
    public ResponseEntity<Curriculo> createCurriculo(@RequestBody Curriculo curriculo) {
        Curriculo savedCurriculo = curriculoService.saveCurriculo(curriculo);
        return ResponseEntity.ok(savedCurriculo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> getCurriculo(@PathVariable Long id) {
        Curriculo curriculo = curriculoService.findCurriculoById(id);
        return ResponseEntity.ok(curriculo);
    }

    @GetMapping
    public ResponseEntity<List<Curriculo>> getAllCurriculos() {
        List<Curriculo> curriculos = curriculoService.findAllCurriculos();
        return ResponseEntity.ok(curriculos);
    }
}