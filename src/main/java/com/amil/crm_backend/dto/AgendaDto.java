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
    private String status;
    private ClientDto clientDto;
    private HorarioDto horarioDto;
    private ServicesDTO servicosDto;

    public AgendaDto(AgendaEntity agendaEntity){
        BeanUtils.copyProperties(agendaEntity, this);

        if (agendaEntity != null && agendaEntity.getClient() != null){
            this.clientDto = new ClientDto(agendaEntity.getClient());
        }

        if (agendaEntity != null && agendaEntity.getHorario() != null){
            this.horarioDto = new HorarioDto(agendaEntity.getHorario());
        }

        if (agendaEntity != null && agendaEntity.getServicos() != null){
            this.servicosDto = new ServicesDTO(agendaEntity.getServicos());
        }

    }

}
