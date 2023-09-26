package com.Itau.Personagem.usecases;

import com.Itau.Personagem.DTO.PersonagemDTO;
import com.Itau.Personagem.gateway.PersonagemGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonagemUseCase {

    @Autowired
    PersonagemGateway personagemGateway;

    public PersonagemDTO idENumero(String id)  {

        boolean e = true;

        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                e = false;
                break;
            }
        }
        return personagemGateway.getPersonagemById(id);
    }
}

