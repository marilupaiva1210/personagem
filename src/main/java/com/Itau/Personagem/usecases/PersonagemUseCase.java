package com.Itau.Personagem.usecases;

import com.Itau.Personagem.DTO.PersonagemDTO;
import com.Itau.Personagem.gateway.PersonagemGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class PersonagemUseCase {

    @Autowired
    PersonagemGateway personagemGateway;

    public PersonagemDTO idENumero(String id) {

        System.out.println(id);

        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id fora do formato!");
            }
        }

        return personagemGateway.getPersonagemById(id);
    }
}







