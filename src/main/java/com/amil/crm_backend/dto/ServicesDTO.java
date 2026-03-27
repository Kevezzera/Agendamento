package com.amil.crm_backend.dto;

import com.amil.crm_backend.entity.ServicosEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Setter
@Getter
public class ServicesDTO {

    private Long id;
    private String nome;
    private float valor;
    private String descricao;
    private String status;

    public ServicesDTO(ServicosEntity servicos){
        BeanUtils.copyProperties(servicos, this);
    }
}
