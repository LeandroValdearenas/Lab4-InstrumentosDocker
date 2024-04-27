package com.example.Practicas.controller;


import com.example.Practicas.model.CategoriaInstrumento;
import com.example.Practicas.service.CategoriaInstrumentoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/categorias")
public class CategoriaInstrumentoController extends BaseControllerImpl<CategoriaInstrumento, CategoriaInstrumentoServiceImpl>{

    private CategoriaInstrumentoServiceImpl service;
    public CategoriaInstrumentoController(CategoriaInstrumentoServiceImpl service) {
        super(service);
    }
}

