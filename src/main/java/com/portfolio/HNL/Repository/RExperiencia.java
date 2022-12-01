package com.portfolio.HNL.Repository;

import com.portfolio.HNL.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {

    public Optional<Experiencia> findByNombreXP(String nombreXP);

    public boolean existsByNombreXP(String nombreXP);
}