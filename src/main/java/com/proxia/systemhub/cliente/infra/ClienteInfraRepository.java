package com.proxia.systemhub.cliente.infra;

import com.proxia.systemhub.cliente.application.repository.ClienteRepository;
import com.proxia.systemhub.cliente.domain.Cliente;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteJPASpringRepository clienteJPASpringRepository;

    @Override
    public void cadastra(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - cadastra");
        try {
            clienteJPASpringRepository.save(cliente);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException(e);
        }
        log.debug("[finish] ClienteInfraRepository - cadastra");
    }

    @Override
    public Cliente buscaClientePorId(UUID id) {
        log.info("[start] ClienteInfraRepository - buscaClientePorId");
        Cliente cliente = clienteJPASpringRepository.findById(id)
                .orElseThrow(EntityExistsException::new);
        log.debug("[finish] ClienteInfraRepository - buscaClientePorId");
        return cliente;
    }
}

