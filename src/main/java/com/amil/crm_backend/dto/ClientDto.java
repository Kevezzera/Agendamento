package com.amil.crm_backend.dto;

import com.amil.crm_backend.entity.ClientEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
public class ClientDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate nascimento;
    private String cell;
    private String cpf;


    public ClientDto(ClientEntity client){
        BeanUtils.copyProperties(client, this);
    }

}
