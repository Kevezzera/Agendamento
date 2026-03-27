package com.amil.crm_backend.controller;

import com.amil.crm_backend.dto.HorarioDto;
import com.amil.crm_backend.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/horarios")
@RestController
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @PostMapping
    public void save(@RequestBody HorarioDto horarioDto){
        horarioService.save(horarioDto);
    }
}
