package com.amil.crm_backend.controller;

import com.amil.crm_backend.dto.AgendaDto;
import com.amil.crm_backend.entity.AgendaEntity;
import com.amil.crm_backend.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/agenda")
@RestController
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping
    public void save(@RequestBody AgendaDto agendaDto){
        agendaService.save(agendaDto);
    }

    @GetMapping("/cliente/{id}")
    public List<AgendaDto> listar(@PathVariable Long id) {
        List<AgendaEntity> agend = agendaService.listServicosCliente(id);

        // Converter Entity -> DTO
        return agend.stream()
                .map(AgendaDto::new) // supondo construtor AgendaDto(AgendaEntity e)
                .toList();
    }
}
