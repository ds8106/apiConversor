package com.conversor.moeda.controller;
import com.conversor.moeda.model.ConversorModel;
import com.conversor.moeda.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversao")
public class ConversorController {

    @Autowired
    private ConversorService conversorService;

    @PostMapping("/entrada")
    public ConversorModel ConversorEntrada(@RequestBody ConversorModel valor) {
        conversorService.realDolar(valor);
        return valor;

    }

}
