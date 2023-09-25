package com.Itau.Personagem.controllers;

import com.Itau.Personagem.DTO.PersonagemDTO;
import com.Itau.Personagem.usecases.PersonagemUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonagemController {

    @Autowired
    PersonagemUseCase personagemUseCase;

    @GetMapping("/personagens/{id}")
    public boolean personagemGet(String idPersonagem) {

        if (idPersonagem != null) {

            return personagemUseCase.idENumero(idPersonagem);

        }
        return false;
    }
}

