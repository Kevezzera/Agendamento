package com.amil.crm_backend.entity;

import com.amil.crm_backend.dto.AgendaDto;
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

    @ManyToOne
    @JoinColumn(name = "id_client")
    private ClientEntity client;

    @ManyToOne
    @JoinColumn(name = "id_horario")
    private HorarioEntity horario;

    @ManyToOne
    @JoinColumn(name = "id_servoco")
    private ServicosEntity servicos;

    public AgendaEntity(AgendaDto agendaDto){
        BeanUtils.copyProperties(agendaDto, this);

        if (agendaDto != null && agendaDto.getClientDto() != null){
            this.client = new ClientEntity(agendaDto.getClientDto());
        }

        if (agendaDto != null && agendaDto.getHorarioDto() != null){
            this.horario = new HorarioEntity(agendaDto.getHorarioDto());
        }

        if(agendaDto != null && agendaDto.getServicosDto() != null){
            this.servicos = new ServicosEntity(agendaDto.getServicosDto());
        }

    }

}