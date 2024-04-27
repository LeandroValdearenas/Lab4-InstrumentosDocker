package com.example.Practicas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="categoria_instrumento")
@Data //Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaInstrumento extends Base{
    private String denominacion;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Instrumento> instrumentos = new HashSet<>();
}
