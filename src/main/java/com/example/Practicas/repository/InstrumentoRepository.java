package com.example.Practicas.repository;

import com.example.Practicas.model.Instrumento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstrumentoRepository extends BaseRepository<Instrumento, Long>{
    List<Instrumento> findAllByCategoria_Id(Long categoriaId);
}
