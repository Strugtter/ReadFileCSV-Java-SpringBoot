package com.example.Procesamiento.Controller;



import com.example.Procesamiento.servicioProcesamiento.ServicioProcesador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1")
public class ControllerFile {

   // private Archivo archivo;
    private ServicioProcesador servicioProcesador;

    @Autowired
    public ControllerFile(ServicioProcesador servicioProcesador) {
        this.servicioProcesador = servicioProcesador;
    }

    @PostMapping("/archivo/procesar")
    public ResponseFile controllerProcesar (@RequestBody Archivo archivo){
        return this.servicioProcesador.serviceProcesar(archivo);
    };
}
