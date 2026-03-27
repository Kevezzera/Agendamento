package com.amil.crm_backend.controller;

import com.amil.crm_backend.dto.ServicesDTO;
import com.amil.crm_backend.service.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/servicos")
@RestController
public class ServocosController {

    @Autowired
    private ServicosService servicosService;

    @PostMapping
    public void save(@RequestBody ServicesDTO servicesDTO){
        servicosService.save(servicesDTO);
    }
}
