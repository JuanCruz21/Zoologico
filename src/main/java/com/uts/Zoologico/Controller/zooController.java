package com.uts.Zoologico.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uts.Zoologico.Repository.Entities.AnimalesEntity;
import com.uts.Zoologico.Repository.Entities.ZooEntity;
import com.uts.Zoologico.Service.AnimalService;
import com.uts.Zoologico.Service.ZooService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/zoo")
public class zooController {
    @Autowired
    private ZooService zooService;
    @Autowired
    private AnimalService animalService;

    @GetMapping("/{id}")
    public ZooEntity findById(@PathVariable Long id) {
        return zooService.findById(id);
    }
    
    @PostMapping("/{idZoo}/{idEspecie}")
    public AnimalesEntity save(@PathVariable Long idZoo, @PathVariable Long idEspecie, @RequestBody AnimalesEntity animal){
        return animalService.save(animal, idZoo, idEspecie);
    }
}
