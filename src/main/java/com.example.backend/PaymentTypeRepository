package com.example.backend.repository;

import com.example.backend.model.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, UUID> {
    List<PaymentType> findByTenantId(UUID tenantId);
}
