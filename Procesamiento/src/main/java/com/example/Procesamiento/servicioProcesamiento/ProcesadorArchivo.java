package com.example.Procesamiento.servicioProcesamiento;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
@Component
public class ProcesadorArchivo {
    public boolean procesar(Persona persona, String [] ext){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Persona> request = new HttpEntity<>(persona);
        boolean respuesta = restTemplate.postForObject("http://localhost:8090/api/v1/validar", request, boolean.class);
        return respuesta;
    }
}
