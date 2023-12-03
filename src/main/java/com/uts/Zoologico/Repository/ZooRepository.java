package com.uts.Zoologico.Repository;

import org.springframework.data.repository.CrudRepository;

import com.uts.Zoologico.Repository.Entities.ZooEntity;

public interface ZooRepository extends CrudRepository<ZooEntity,Long> {
    
}
