package com.example.Validador.Strategy;

import com.example.Validador.Controller.Persona;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class ValidarXLSX {


    public boolean validarLinea(Persona persona) {

        Set<String> set = new HashSet<String>(Arrays.asList(
                "Near Miss", "Lost Time", "First Aid"
        ));
        return  true;
     //   return set.contains(line.getReportType()) && !line.getInjuryLocation().equals("N/A");
    }
}
