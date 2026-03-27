
package com.amil.crm_backend.entity;

import com.amil.crm_backend.dto.ServicesDTO;
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
public class ServicosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private float valor;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String status;

    public ServicosEntity(ServicesDTO servicesDTO){
        BeanUtils.copyProperties(servicesDTO, this);
    }
}
