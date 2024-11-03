package com.conversor.moeda.service;

import com.conversor.moeda.constantes.ConversorConst;
import com.conversor.moeda.model.ConversorModel;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {



    public ConversorModel realDolar(ConversorModel result) {
        result.setValorEntrada(result.getValorEntrada() / ConversorConst.DOLAR);
        return result;

    }

    public ConversorModel realEuro(ConversorModel result) {
        result.setValorEntrada(result.getValorEntrada() / ConversorConst.EURO);
        return result;
    }
}
