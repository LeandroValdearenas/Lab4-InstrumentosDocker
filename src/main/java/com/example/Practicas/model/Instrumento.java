package com.example.Practicas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="instrumento")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class Instrumento extends Base{
    private String instrumento;
    private String marca;
    private String modelo;
    private String imagen;
    private Double precio;
    private String costoEnvio;
    private Integer cantidadVendida;
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private CategoriaInstrumento categoria;
}
