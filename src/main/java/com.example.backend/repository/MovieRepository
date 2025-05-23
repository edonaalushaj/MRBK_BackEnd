package com.example.backend.repository;
import com.example.backend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTenantId(UUID tenantId);
}
