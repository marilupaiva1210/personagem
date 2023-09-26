package com.Itau.Personagem.controllers;

import com.Itau.Personagem.usecases.PersonagemUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonagemController {

    @Autowired
    PersonagemUseCase personagemUseCase;

    @GetMapping("/personagens/{id}")
    public ResponseEntity<String> personagemGet(String idPersonagem) {

        String nomePersonagem = String.valueOf(personagemUseCase.idENumero(idPersonagem));

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}