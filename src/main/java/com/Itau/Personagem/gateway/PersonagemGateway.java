package com.Itau.Personagem.gateway;

import com.Itau.Personagem.DTO.PersonagemDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonagemGateway {

    private final String API_URL = "https://rickandmortyapi.com/api/character/";
    private RestTemplate restTemplate = new RestTemplate();

    public PersonagemDTO getPersonagemById(String id) {


               String url = API_URL + id;
               PersonagemDTO personagem = restTemplate.getForObject(url, PersonagemDTO.class);

               return personagem;
    }
}
