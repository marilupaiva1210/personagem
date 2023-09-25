package com.Itau.Personagem.usecases;

import org.springframework.stereotype.Component;

@Component
public class PersonagemUseCase {

    public boolean idENumero(String id)  {

        boolean e = true;

        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                e = false;
                break;
            }

        }
        return e;
    }
}

