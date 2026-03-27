package com.amil.crm_backend.dto;

import com.amil.crm_backend.entity.AgendaEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Setter
@Getter
public class AgendaDto {

    private Long id;
    private String nome;
    private float valor;
    private String descricao;
    private String status;

    public AgendaDto(AgendaEntity agendaEntity){
        BeanUtils.copyProperties(agendaEntity, this);
    }
}
