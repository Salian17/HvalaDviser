package com.example.hvaladviser.repositories;

import com.example.hvaladviser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * This class representing User repository
 * with extends JpaRepository
 *
 * @author Xenia
 */
public interface UserRepository extends JpaRepository<User, UUID> {

}
