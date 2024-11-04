package com.example.hvaladviser.repositories;

import com.example.hvaladviser.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * This class representing Location repository
 * with extends JpaRepository
 *
 * @author Salian17
 */
public interface LocationRepository extends JpaRepository<Location, UUID> {
}
