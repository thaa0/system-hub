package com.proxia.systemhub.cliente.application.api;

import com.proxia.systemhub.cliente.domain.Cliente;
import com.proxia.systemhub.cliente.domain.Endereco;
import lombok.Getter;

@Getter
public class ClienteResponse {
    private String name;
    private String celular;
    private String cpf_cnpj;
    private Endereco endereco;

    public ClienteResponse(Cliente cliente) {
        this.endereco = cliente.getEndereco();
        this.cpf_cnpj = cliente.getCpf_cnpj();
        this.celular = cliente.getCelular();
        this.name = cliente.getName();
    }
}
