package com.proxia.systemhub.cliente.application.service;

import com.proxia.systemhub.cliente.application.api.ClienteRequest;
import com.proxia.systemhub.cliente.application.repository.ClienteRepository;
import com.proxia.systemhub.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public void cadastraCliente(ClienteRequest cliente) {
    log.info("[start] ClienteApplicationService - cadastraCliente");
    Cliente clienteCadastrado = new Cliente(cliente);
    clienteRepository.cadastra(clienteCadastrado);
    log.debug("[finish] ClienteApplicationService - cadastraCliente");
    }
}
