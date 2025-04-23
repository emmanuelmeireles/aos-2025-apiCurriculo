package com.exemplo.curriculoapi.repository;

import com.exemplo.curriculoapi.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}