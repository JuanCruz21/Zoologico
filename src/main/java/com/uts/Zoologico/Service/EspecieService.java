package com.uts.Zoologico.Service;

import com.uts.Zoologico.Repository.Entities.EspecieEntity;

public interface EspecieService {

    EspecieEntity findById(Long id);
    EspecieEntity save(EspecieEntity especie);
    
}
