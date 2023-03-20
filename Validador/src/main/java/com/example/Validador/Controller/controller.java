package com.example.Validador.Controller;

import com.example.Validador.Strategy.ValidarCSV;
import com.example.Validador.Strategy.ValidarXLSX;
import com.example.Validador.servicioValidador.ServicioValidar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class controller {

    private ServicioValidar validarServicio;
    private ValidarCSV validarCSV;
    private ValidarXLSX validarXLSX;

  @Autowired
  public controller(ServicioValidar validarServicio,ValidarCSV validarCSV, ValidarXLSX validarXLSX) {
      this.validarServicio = validarServicio;
      this.validarCSV = validarCSV;
      this.validarXLSX = validarXLSX;
  }

  @PostMapping("/validar")
    public boolean validar (@RequestBody Persona persona){
      validarServicio.tipoArchivo(validarCSV);
      return validarServicio.ValidadorServicio(persona);
    }
}
