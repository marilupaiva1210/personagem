package com.Itau.Personagem.usecases;

import com.Itau.Personagem.gateway.PersonagemGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class PersonagemUseCase {
    @Autowired
    PersonagemGateway personagemGateway;

    public String idENumero(String id) {

        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {

                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id fora do formato!");
            }
        }

        String nome =  personagemGateway.getPersonagemById(id).getNome();

        verificarFamilia(nome);

        return nome;
    }

    private void verificarFamilia(String nome) {

        if (nome != null && (nome.contains("Beth Smith") || nome.contains("Morty Smith") || nome.contains("Jerry Smith"))) {

            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Pertencem à família Smith");
        }
    }
}







