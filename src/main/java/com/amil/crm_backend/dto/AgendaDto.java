package com.amil.crm_backend.dto;
import com.amil.crm_backend.entity.AgendaEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public AgendaDto(AgendaEntity agendaEntity){
        BeanUtils.copyProperties(agendaEntity, this);
    }

}
