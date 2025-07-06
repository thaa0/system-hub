package com.proxia.systemhub.cliente.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Endereco {
    private String cep;
    private String cidade;
    private String bairro;
    private String rua;
}
