package com.example.backend.repository;

import com.example.backend.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    List<Cinema> findByTenantId(UUID tenantId);
}
