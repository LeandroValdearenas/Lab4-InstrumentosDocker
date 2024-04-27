package com.example.Practicas.repository;

import com.example.Practicas.model.CategoriaInstrumento;
import com.example.Practicas.model.Instrumento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaInstrumentoRepository extends BaseRepository<CategoriaInstrumento, Long>{

}
