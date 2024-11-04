package com.example.hvaladviser.repositories;

import java.util.UUID;

/**
 * This class representing User repository
 * with extends JpaRepository
 *
 * @author Xenia
 */
public interface UserRepository extends JpaRepository<User, UUID> {

}
