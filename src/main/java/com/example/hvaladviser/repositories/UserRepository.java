package com.example.hvaladviser.repositories;

import com.example.hvaladviser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * This class representing User repository
 * with extends JpaRepository
 *
 * @author Xenia
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
