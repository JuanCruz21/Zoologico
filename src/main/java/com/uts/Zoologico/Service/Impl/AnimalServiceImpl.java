package com.uts.Zoologico.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uts.Zoologico.Repository.AnimalesRepository;
import com.uts.Zoologico.Repository.EspecieRepository;
import com.uts.Zoologico.Repository.ZooRepository;
import com.uts.Zoologico.Repository.Entities.AnimalesEntity;
import com.uts.Zoologico.Repository.Entities.EspecieEntity;
import com.uts.Zoologico.Repository.Entities.ZooEntity;
import com.uts.Zoologico.Service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalesRepository animalRepository;
    @Autowired
    private ZooRepository zooRepository;
    @Autowired
    private EspecieRepository especieRepository;

    @Override
    public AnimalesEntity save(AnimalesEntity animales, Long idZoo, Long idEspecie) {
        
        Optional<ZooEntity> zooOptional=zooRepository.findById(idZoo);
        Optional<EspecieEntity> especieOptional=especieRepository.findById(idEspecie);

        if(zooOptional.isPresent() && especieOptional.isPresent()){
            ZooEntity zooEntity= zooOptional.get();
            EspecieEntity especieEntity = especieOptional.get();
            animales.setZoo(zooEntity);
            animales.setEspecie(especieEntity);
            animalRepository.save(animales);

            return animales;
        }else{
            throw new NullPointerException("Zoologico o especie no existe en la base de datos");
        }
    }
}
