package com.amil.crm_backend.dto;

import com.amil.crm_backend.entity.ClientEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
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

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email
    private String email;

    @NotNull
    private LocalDate nascimento;

    @NotNull
    private String cell;

    @NotNull
    private String cpf;


    public ClientDto(ClientEntity clientEntity){
        BeanUtils.copyProperties(clientEntity, this);
    }

}
