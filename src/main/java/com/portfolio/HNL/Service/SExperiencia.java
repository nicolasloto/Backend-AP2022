package com.portfolio.HNL.Service;

import com.portfolio.HNL.Entity.Experiencia;
import com.portfolio.HNL.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {

    @Autowired
    RExperiencia rExperiencia;

    public List<Experiencia> list() {
        return rExperiencia.findAll();
    }

    public Optional<Experiencia> getOne(int id) {
        return rExperiencia.findById(id);

    }

    public Optional<Experiencia> getByNombreXP(String nombreXP) {
        return rExperiencia.findByNombreXP(nombreXP);
    }

    public void save(Experiencia experiencia) {
        rExperiencia.save(experiencia);
    }

    public void delete(int id) {
        rExperiencia.deleteById(id);
    }

    public boolean existsById(int id) {
        return rExperiencia.existsById(id);
    }

    public boolean existsByNombreXP(String nombreXP) {
        return rExperiencia.existsByNombreXP(nombreXP);
    }
}