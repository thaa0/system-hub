package com.proxia.systemhub.cliente.application.api;

import com.proxia.systemhub.cliente.domain.Endereco;

import java.util.UUID;

public class ClienteResponse {
    private UUID id;
    private String name;
    private String celular;
    private String cpf_cnpj;
    private Endereco endereco;
}
