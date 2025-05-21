package com.example.backend.repository;

import com.example.backend.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FoodRepository extends JpaRepository<Food, UUID> {
    List<Food> findByTenantId(UUID tenantId);
}
