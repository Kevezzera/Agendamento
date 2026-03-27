package com.amil.crm_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Table(name = "agenda")
@NoArgsConstructor
@Setter
@Getter
@Entity
public class AgendaEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(nullable = false)
    private String status;

    public AgendaEntity(AgendaEntity agendaEntity){
        BeanUtils.copyProperties(agendaEntity, this);
    }



}