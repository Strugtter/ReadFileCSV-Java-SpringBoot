package com.example.Validador.Strategy;

import com.example.Validador.Controller.Persona;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class ValidarCSV implements  Analizar{
    @Override
    public boolean validarLinea(Persona persona){
        String[] fecha = persona.getDataOfBirth().split("-");
     //   LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(persona.getDataOfBirth()));
        LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
        LocalDate fechaCondicional = LocalDate.of(1980, 1, 1);
        String EmailRegEx = "^(.+)@(.+)$";
        String Email = persona.getEmail();
        String job = persona.getJobTitle();
        Set<String> profession = new HashSet<String>(Arrays.asList(
                "Haematologist", "Phytotherapist", "Building surveyor", "Insurance",
                "account manager", "Educational psychologist"
        ));
        return Email.matches(EmailRegEx) && fechaNacimiento.isAfter(fechaCondicional) && profession.contains(job);
    }
}
