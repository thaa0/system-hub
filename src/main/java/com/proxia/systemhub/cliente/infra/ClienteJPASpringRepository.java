package com.proxia.systemhub.cliente.infra;

import com.proxia.systemhub.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteJPASpringRepository extends JpaRepository<Cliente, UUID> {
}