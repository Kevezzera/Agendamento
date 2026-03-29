package com.amil.crm_backend.controller;

import com.amil.crm_backend.dto.AgendaDto;
import com.amil.crm_backend.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/agenda")
@RestController
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping
    public void save(@RequestBody AgendaDto agendaDto){
        agendaService.save(agendaDto);
    }
}
