package com.proxia.systemhub.cliente.domain;

import com.proxia.systemhub.cliente.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotBlank(message="O nome não pode estar em branco!")
    private String name;
    @NotBlank(message="O celular não pode estar em branco!")
    private String celular;
    @NotBlank(message="Precisamos do cpf ou cnpj para prosseguir!")
    private String cpf_cnpj;
    @Valid
    @Embedded
    private Endereco endereco;

    public Cliente(ClienteRequest cliente) {
        this.name = cliente.getName();
        this.celular = cliente.getCelular();
        this.cpf_cnpj = cliente.getCpf_cnpj();
        this.endereco = cliente.getEndereco();
    }
}
