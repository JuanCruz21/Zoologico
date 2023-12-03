package com.uts.Zoologico.Repository.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Entity
@Table(name="animal")
public class AnimalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sexo;
    private Date fechaNacimiento;
    private String Pais;
    private String Continente;
    @JsonIgnoreProperties("animal")
    @ManyToOne
    @JoinColumn(name = "especie_id")
    private EspecieEntity especie;
    @ManyToOne
    @JoinColumn(name = "zoologico_id")
    private ZooEntity zoo;
}
