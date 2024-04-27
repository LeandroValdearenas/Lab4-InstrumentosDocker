package com.example.Practicas.controller;


import com.example.Practicas.model.Instrumento;
import com.example.Practicas.service.InstrumentoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/instrumentos")
public class InstrumentoController extends BaseControllerImpl<Instrumento, InstrumentoServiceImpl>{
    protected final InstrumentoServiceImpl service;

    public InstrumentoController(InstrumentoServiceImpl service) {
        super(service);
        this.service = service;
    }

    @GetMapping("categoria/{categoriaId}")
    public ResponseEntity<?> getByCategoria_Id(@PathVariable Long categoriaId){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAllByCategoria_Id(categoriaId));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}

