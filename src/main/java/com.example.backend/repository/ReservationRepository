package com.example.backend.repository;

import com.example.backend.model.Reservation;
import com.example.backend.model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

    List<Reservation> findByShowtime(Showtime showtime);

    // Optional: Find all reservations for a specific user
    List<Reservation> findByUserId(UUID userId);

    // Optional: Find all reservations for a specific tenant
    List<Reservation> findByTenantId(UUID tenantId);
}
