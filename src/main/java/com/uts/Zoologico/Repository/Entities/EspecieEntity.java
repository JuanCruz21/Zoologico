package com.uts.Zoologico.Repository.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="especie")
public class EspecieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String EspecieAnimal;
    private String NombreVulgar;
    private String NombreCientifico;
    private String Familia;
    private Character peligroextincion;
}
