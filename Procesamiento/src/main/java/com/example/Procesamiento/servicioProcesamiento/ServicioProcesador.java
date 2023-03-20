package com.example.Procesamiento.servicioProcesamiento;

import com.example.Procesamiento.Controller.Archivo;
import com.example.Procesamiento.Controller.ResponseFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioProcesador {

    private int contadorLineaValida = 0;
    private int contadorLineaInvalida = 0;
    private ReadFile readfile;
    private ProcesadorArchivo procesadorArchivo;

    @Autowired
    public ServicioProcesador(ReadFile readfile, ProcesadorArchivo procesadorArchivo) {
        this.readfile = readfile;
        this.procesadorArchivo = procesadorArchivo;
    }

    public ResponseFile serviceProcesar (Archivo archivo){
        String[] exte = archivo.getRuta().split("\\.");
       List<Persona> listaPersona = readfile.leer(archivo.getRuta());
       listaPersona.stream().skip(1)
                .forEach(persona -> {
                    boolean isValida = procesadorArchivo.procesar(persona, exte);
                    if(isValida){
                        contadorLineaValida++;
                    }else {
                        contadorLineaInvalida++;
                    }
                });
       return new ResponseFile(contadorLineaValida,contadorLineaInvalida);
    }

    }
