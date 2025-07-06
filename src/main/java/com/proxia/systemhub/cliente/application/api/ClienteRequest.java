package com.proxia.systemhub.cliente.application.api;

import com.proxia.systemhub.cliente.domain.Endereco;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class ClienteRequest {
    @NotBlank(message="O nome não pode estar em branco!")
    private String name;
    @NotBlank(message="O celular não pode estar em branco!")
    private String celular;
    @NotBlank(message="Precisamos do cpf ou cnpj para prosseguir!")
    private String cpf_cnpj;
    @NotEmpty
    @Embedded
    private Endereco endereco;
}
