package com.amil.crm_backend.entity;

import com.amil.crm_backend.dto.ClientDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

@Table(name = "clientes")
@NoArgsConstructor
@Setter
@Getter
@Entity
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private LocalDate nascimento;

    @Column(nullable = false)
    private String cell;

    @Column(nullable = false)
    private String cpf;


    public ClientEntity(ClientDto clientDto){
        BeanUtils.copyProperties(clientDto, this);
    }

}
