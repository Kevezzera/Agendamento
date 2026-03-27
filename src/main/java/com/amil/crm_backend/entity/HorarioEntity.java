package com.amil.crm_backend.entity;

import com.amil.crm_backend.dto.HorarioDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "horario")
@NoArgsConstructor
@Setter
@Getter
@Entity
public class HorarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate data;
    @Column(nullable = false)
    private LocalTime hora;

    public HorarioEntity(HorarioDto horarioDto){
        BeanUtils.copyProperties(horarioDto, this);
    }

}
