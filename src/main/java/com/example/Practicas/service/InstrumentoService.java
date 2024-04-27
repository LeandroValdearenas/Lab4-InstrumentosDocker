package com.example.Practicas.service;


import com.example.Practicas.model.Instrumento;

import java.util.List;

public interface InstrumentoService extends BaseService<Instrumento, Long>{
    List<Instrumento> findAllByCategoria_Id(Long categoriaId) throws Exception;
}
