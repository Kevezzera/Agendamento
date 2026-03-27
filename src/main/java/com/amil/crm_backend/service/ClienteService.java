package com.amil.crm_backend.service;

import com.amil.crm_backend.dto.ClientDto;
import com.amil.crm_backend.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteService clienteService;

    public void save(ClientDto clientDto){
        ClientEntity clientEntity = new ClientEntity(clientDto);
    }

}
