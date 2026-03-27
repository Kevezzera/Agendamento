package com.amil.crm_backend.dto;

import com.amil.crm_backend.entity.HorarioEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@Setter
@Getter
public class HorarioDto {

    private Long id;
    private LocalDate data;
    private LocalTime hora;

    public HorarioDto(HorarioEntity horario){
        BeanUtils.copyProperties(horario, this);
    }
}
