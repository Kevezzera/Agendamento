package com.amil.crm_backend.controller;

import com.amil.crm_backend.dto.ClientDto;
import com.amil.crm_backend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/client")
@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void save(@RequestBody ClientDto clientDto){
        clienteService.save(clientDto);
    }

}
