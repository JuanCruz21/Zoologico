package com.uts.Zoologico.Repository.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Entity
@Table(name="Zoo")
public class ZooEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String Nombre;
    private String Ciudad;
    private String Pais;
    private Number Tamaño;
    private Double PresupuestoAnual;
    @OneToMany(mappedBy = "zoo")
    @JsonIgnoreProperties("zoo")
    private List<AnimalesEntity> animalesEntity;
}
