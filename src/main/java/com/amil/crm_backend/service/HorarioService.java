package com.amil.crm_backend.service;

import com.amil.crm_backend.dto.HorarioDto;
import com.amil.crm_backend.entity.HorarioEntity;
import com.amil.crm_backend.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    public void save(HorarioDto horarioDto){
        HorarioEntity horario = new HorarioEntity(horarioDto);
    }
}
