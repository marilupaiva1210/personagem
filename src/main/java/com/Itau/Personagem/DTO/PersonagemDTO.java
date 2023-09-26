package com.Itau.Personagem.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PersonagemDTO implements Serializable {

    @JsonProperty("id")
    String codigo;

    @JsonProperty("name")
    String nome;

    @JsonProperty("species")
    String especie;

}

