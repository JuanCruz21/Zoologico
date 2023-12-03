package com.uts.Zoologico.Service;

import com.uts.Zoologico.Repository.Entities.AnimalesEntity;

public interface AnimalService {

    AnimalesEntity save(AnimalesEntity animal, Long idZoo, Long idEspecie);

}
