package com.proxia.systemhub.cliente.application.repository;

import com.proxia.systemhub.cliente.domain.Cliente;

import java.util.UUID;

public interface ClienteRepository {
    void cadastra(Cliente cliente);
    Cliente buscaClientePorId(UUID id);
}
