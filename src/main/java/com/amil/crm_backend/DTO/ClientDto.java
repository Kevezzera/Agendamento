package com.amil.crm_backend.DTO;

import com.amil.crm_backend.entity.ClientEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class ClientDto {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime nascimento;
    private String cell;
    private String cpf;


    public ClientDto(ClientEntity client){
        BeanUtils.copyProperties(client, this);
    }

}
