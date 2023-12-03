package com.uts.Zoologico.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uts.Zoologico.Repository.ZooRepository;
import com.uts.Zoologico.Repository.Entities.ZooEntity;
import com.uts.Zoologico.Service.ZooService;

@Service
public class ZooServiceImpl implements ZooService {

    @Autowired
    private ZooRepository zooRepository;

    @Override
    @Transactional(readOnly = true)
    public ZooEntity findById(Long Id) {
        return zooRepository.findById(Id).orElse(null);
    }
    
}
