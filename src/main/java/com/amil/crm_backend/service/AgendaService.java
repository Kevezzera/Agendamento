package com.amil.crm_backend.service;

import com.amil.crm_backend.dto.AgendaDto;
import com.amil.crm_backend.entity.AgendaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {

     @Autowired
     private AgendaService agendaService;

     public void save(AgendaDto agendaDto){
          AgendaEntity agendaEntity = new AgendaEntity(agendaDto);
     }


}
