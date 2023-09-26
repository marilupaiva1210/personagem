package com.Itau.Personagem.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonagemDTO {

    @JsonProperty("id")
    String codigo;

    @JsonProperty("name")
    String nome;

    @JsonProperty("species")
    String especie;

}

