package com.example.hvaladviser.repositories;

import com.example.hvaladviser.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * This class representing Restaurant repository
 * with extends JpaRepository
 *
 * @author Xenia
 */
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {

}
