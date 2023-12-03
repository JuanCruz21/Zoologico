package com.uts.Zoologico.Service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uts.Zoologico.Repository.EspecieRepository;
import com.uts.Zoologico.Repository.Entities.EspecieEntity;
import com.uts.Zoologico.Service.EspecieService;

@Service
public class EspecieServiceimpl implements EspecieService {

    @Autowired
    private EspecieRepository especieRepository;

    @Override
    @Transactional(readOnly = true)
    public EspecieEntity findById(Long id) {
        return especieRepository.findById(id).orElse(null);
    }

    @Override
    public EspecieEntity save(EspecieEntity especie) {
        especieRepository.save(especie);
        return especie;
    }
    
}
