package com.example.backend.repository;

import com.example.backend.model.ReservationFood;
import com.example.backend.model.ReservationFoodId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationFoodRepository extends JpaRepository<ReservationFood, ReservationFoodId> {
}
