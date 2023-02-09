package com.portfolio.HNL.Service;

import com.portfolio.HNL.Entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.HNL.Repository.RPersona;
import java.util.Optional;
import javax.transaction.Transactional;

@Service
@Transactional
public class SPersona{

    @Autowired
    RPersona rPersona;
    
    public List<Persona> list() {
        return rPersona.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return rPersona.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return rPersona.findByNombre(nombre);
    }

    public void save(Persona persona) {
        rPersona.save(persona);
    }

    public void delete(int id) {
        rPersona.deleteById(id);
    }

    public boolean existsById(int id) {
        return rPersona.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rPersona.existsByNombre(nombre);
    }
}