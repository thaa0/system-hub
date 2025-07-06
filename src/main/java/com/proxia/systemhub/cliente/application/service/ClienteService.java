package com.proxia.systemhub.cliente.application.service;

import com.proxia.systemhub.cliente.application.api.ClienteRequest;
import com.proxia.systemhub.cliente.application.api.ClienteResponse;

import java.util.UUID;

public interface ClienteService {
    void cadastraCliente(ClienteRequest cliente);
    ClienteResponse buscaCliente(UUID id);
}
