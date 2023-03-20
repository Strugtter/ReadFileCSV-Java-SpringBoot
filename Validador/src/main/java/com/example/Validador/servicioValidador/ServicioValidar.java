package com.example.Validador.servicioValidador;

import com.example.Validador.Controller.Persona;
import com.example.Validador.Strategy.Analizar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioValidar {

  @Autowired
    private Analizar analizar;

    public void tipoArchivo (Analizar analizar){
        this.analizar = analizar;
    }
    public boolean ValidadorServicio(Persona persona){
        return this.analizar.validarLinea(persona);
    }
}
