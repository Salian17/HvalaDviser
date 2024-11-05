package com.example.hvaladviser.repositories;

import com.example.hvaladviser.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * This class representing Feedback repository
 * with extends JpaRepository
 *
 * @author Salian17
 */
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, UUID> {
}
