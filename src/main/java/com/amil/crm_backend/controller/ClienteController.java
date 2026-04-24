package com.amil.crm_backend.controller;

import com.amil.crm_backend.dto.ClientDto;
import com.amil.crm_backend.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Clientes", description = "Gerenciamento do registro de clientes")
@RequestMapping("/client")
@RestController
public class ClienteController {


    final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(summary = "Cadastrar novo cliente", description = "Cadastre um novo cliente.")
    @PostMapping
    public ResponseEntity<String> save(@Valid @RequestBody ClientDto clientDto){
        String msg = clienteService.save(clientDto);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
