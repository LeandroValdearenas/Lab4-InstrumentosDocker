package com.example.Practicas.service;

import com.example.Practicas.model.Instrumento;
import com.example.Practicas.repository.InstrumentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class InstrumentoServiceImpl extends BaseServiceImpl<Instrumento, Long> implements InstrumentoService {

    private InstrumentoRepository instrumentoRepository;
    public InstrumentoServiceImpl(InstrumentoRepository instrumentoRepository) {
        super(instrumentoRepository);
        this.instrumentoRepository = instrumentoRepository;
    }

    @Transactional
    public List<Instrumento> findAllByCategoria_Id(Long categoriaId) throws Exception {
        try {
            return instrumentoRepository.findAllByCategoria_Id(categoriaId);
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
