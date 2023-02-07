package com.portfolio.HNL.Service;

import com.portfolio.HNL.Entity.Skill;
import com.portfolio.HNL.Repository.RSkill;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SSkill {
    @Autowired
    RSkill rskill;
    
    public List<Skill> list(){
        return rskill.findAll();
    }
    
    public Optional<Skill> getOne(int id){
        return rskill.findById(id);
    }
    
    public Optional<Skill> getByNombre(String nombre){
        return rskill.findByNombre(nombre);
    }
    
    public void save(Skill skill){
        rskill.save(skill);
    }
    
    public void delete(int id){
        rskill.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rskill.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rskill.existsByNombre(nombre);
    }
}