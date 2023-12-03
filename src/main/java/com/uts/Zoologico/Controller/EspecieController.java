package com.uts.Zoologico.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uts.Zoologico.Repository.Entities.EspecieEntity;
import com.uts.Zoologico.Service.EspecieService;

@RestController
@RequestMapping("/Especie")
public class EspecieController {
    @Autowired
    private EspecieService especieService;

    @GetMapping("/{id}")
    public EspecieEntity findById(@PathVariable Long id){
        return especieService.findById(id);
    }

    @PostMapping("/guardar")
    public EspecieEntity save(@RequestBody EspecieEntity especie){
        return especieService.save(especie);
    }
}
