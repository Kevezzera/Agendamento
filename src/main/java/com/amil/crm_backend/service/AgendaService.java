package com.amil.crm_backend.service;

import com.amil.crm_backend.dto.AgendaDto;
import com.amil.crm_backend.entity.AgendaEntity;
import com.amil.crm_backend.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {

     @Autowired
     private AgendaRepository agendaRepository;

     public void save(AgendaDto agendaDto){
          AgendaEntity agendaEntity = new AgendaEntity(agendaDto);
          agendaRepository.save(agendaEntity);
     }

     public List<AgendaEntity> listServicosCliente(Long id){
          return agendaRepository.findByClient_Id(id);
     }

}
