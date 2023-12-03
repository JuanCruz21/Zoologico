package com.uts.Zoologico.Service;

import com.uts.Zoologico.Repository.Entities.ZooEntity;

public interface ZooService {
    ZooEntity findById(Long Id);
}