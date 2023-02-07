package com.portfolio.HNL.Repository;

import com.portfolio.HNL.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RSkill extends JpaRepository<Skill, Integer>{
    Optional<Skill> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
