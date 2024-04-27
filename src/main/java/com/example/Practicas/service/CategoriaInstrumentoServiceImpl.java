package com.example.Practicas.service;

import com.example.Practicas.model.CategoriaInstrumento;
import com.example.Practicas.model.Instrumento;
import com.example.Practicas.repository.CategoriaInstrumentoRepository;
import com.example.Practicas.repository.InstrumentoRepository;
import org.springframework.stereotype.Service;


@Service
public class CategoriaInstrumentoServiceImpl extends BaseServiceImpl<CategoriaInstrumento, Long> implements CategoriaInstrumentoService {

    private CategoriaInstrumentoRepository categoriaInstrumentoRepository;
    public CategoriaInstrumentoServiceImpl(CategoriaInstrumentoRepository categoriaInstrumentoRepository) {
        super(categoriaInstrumentoRepository);
        this.categoriaInstrumentoRepository = categoriaInstrumentoRepository;
    }
}
