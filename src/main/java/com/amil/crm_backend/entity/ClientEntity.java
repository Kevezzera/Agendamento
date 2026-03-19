package com.amil.crm_backend.entity;

import com.amil.crm_backend.DTO.ClientDto;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class ClientEntity {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime nascimento;
    private String cell;
    private String cpf;


    public ClientEntity(ClientDto client){
        BeanUtils.copyProperties(client, this);
    }


}
