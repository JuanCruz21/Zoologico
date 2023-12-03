package com.uts.Zoologico.Repository;

import org.springframework.data.repository.CrudRepository;

import com.uts.Zoologico.Repository.Entities.EspecieEntity;

public interface EspecieRepository extends CrudRepository<EspecieEntity,Long>  {
    
}
