package com.example.CurriculoApi.controller;

import com.example.CurriculoApi.model.Curriculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.CurriculoApi.service.CurriculoService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {

    @Autowired
    CurriculoService curriculoService;

    @PostMapping("/create")
    public ResponseEntity<Curriculo> createCurriculo(@RequestBody Curriculo curriculo) {
        Curriculo savedCurriculo = curriculoService.saveCurriculo(curriculo);
        return ResponseEntity.ok(savedCurriculo);
    }

    @GetMapping("/getCurriculo/{id}")
    public ResponseEntity<Curriculo> getCurriculo(@PathVariable Long id) {
        Optional<Curriculo> curriculo = curriculoService.findCurriculoById(id);
        return curriculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/getTotal")
    public ResponseEntity<List<Curriculo>> getAllCurriculos() {
        List<Curriculo> curriculos = curriculoService.findAllCurriculos();
        return ResponseEntity.ok(curriculos);
    }
    @GetMapping("/teste")
    public ResponseEntity<String> testarApi() {
        return ResponseEntity.ok("API funcionando!");
    }
}