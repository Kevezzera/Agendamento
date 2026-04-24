package com.amil.crm_backend.repository;

import com.amil.crm_backend.entity.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

    List<AgendaEntity> findByClient_Id(Long id);
}
