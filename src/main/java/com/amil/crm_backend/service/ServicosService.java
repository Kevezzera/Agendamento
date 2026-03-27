package com.amil.crm_backend.service;

import com.amil.crm_backend.dto.ServicesDTO;
import com.amil.crm_backend.entity.ServicosEntity;
import com.amil.crm_backend.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicosService {

    @Autowired
    private ServicosRepository servicosRepository;

    public void save(ServicesDTO servicesDTO){
        ServicosEntity servicos = new ServicosEntity(servicesDTO);
    }
}
