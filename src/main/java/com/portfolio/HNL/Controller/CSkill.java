package com.portfolio.HNL.Controller;

import com.portfolio.HNL.Dto.dtoSkill;
import com.portfolio.HNL.Entity.Skill;
import com.portfolio.HNL.Service.SSkill;
import com.portfolio.HNL.Security.Controller.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "https://frontend-hnl.web.app")
public class CSkill {

    @Autowired
    SSkill sSkill;

    @GetMapping("/lista")
    public ResponseEntity<List<Skill>> list() {
        List<Skill> list = sSkill.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Skill> getById(@PathVariable("id") int id) {
        if (!sSkill.existsById(id)) {
            return new ResponseEntity(new Mensaje("ID inexistente"), HttpStatus.BAD_REQUEST);
        }

        Skill skill = sSkill.getOne(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkill dtoskill) {
        if (StringUtils.isBlank(dtoskill.getNombre())) {
            return new ResponseEntity(new Mensaje("Campos obligatorios"), HttpStatus.BAD_REQUEST);
        }
        if (sSkill.existsByNombre(dtoskill.getNombre())) {
            return new ResponseEntity(new Mensaje("Nombre existente"), HttpStatus.BAD_REQUEST);
        }
        Skill skill = new Skill(dtoskill.getNombre(), dtoskill.getPercent());
        sSkill.save(skill);
        return new ResponseEntity(new Mensaje("Habilidad creada exitosamente"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkill dtoskill) {
        if (!sSkill.existsById(id)) {
            return new ResponseEntity(new Mensaje("ID inexistente"), HttpStatus.BAD_REQUEST);
        }
        if (sSkill.existsByNombre(dtoskill.getNombre()) && sSkill.getByNombre(dtoskill.getNombre()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Nombre existente"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoskill.getNombre())) {
            return new ResponseEntity(new Mensaje("Campos obligatorios"), HttpStatus.BAD_REQUEST);
        }

        Skill skill = sSkill.getOne(id).get();
        skill.setNombre(dtoskill.getNombre());
        skill.setPercent(dtoskill.getPercent());

        sSkill.save(skill);
        return new ResponseEntity(new Mensaje("Habilidad actualizada exitosamente"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkill.existsById(id)) {
            return new ResponseEntity(new Mensaje("ID inexistente"), HttpStatus.NOT_FOUND);
        }
        sSkill.delete(id);
        return new ResponseEntity(new Mensaje("Habilidad elminada exitosamente"), HttpStatus.OK);
    }
}
