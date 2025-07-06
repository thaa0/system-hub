package com.proxia.systemhub.cliente.application.api;

import com.proxia.systemhub.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
@Log4j2
public class ClienteAPI {
    private final ClienteService clienteService;

    @PostMapping("/cadastra")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastraCliente(@RequestBody ClienteRequest cliente) {
    log.info("[start] ClienteAPI - cadastraCliente");
    clienteService.cadastraCliente(cliente);
    log.debug("[finish] ClienteAPI - cadastraCliente");
    }

}