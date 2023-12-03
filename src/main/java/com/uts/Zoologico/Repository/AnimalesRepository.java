package com.uts.Zoologico.Repository;

import org.springframework.data.repository.CrudRepository;

import com.uts.Zoologico.Repository.Entities.AnimalesEntity;

public interface AnimalesRepository extends CrudRepository<AnimalesEntity,Long> {
    
}
