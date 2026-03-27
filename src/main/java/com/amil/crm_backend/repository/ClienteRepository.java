package com.amil.crm_backend.repository;

import com.amil.crm_backend.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClientEntity, Long> {

}
