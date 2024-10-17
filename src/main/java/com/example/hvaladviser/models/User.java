package com.example.hvaladviser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

/**
 * This class representing User model
 *
 * @property firstName The first name of user.
 * @property lastName The last name of user.
 * @property username The username of user.
 * @property email The email of user.
 * @property password The password of user.
 *
 * @author Xenia
 */
@Entity
public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;

    /**
     * Protected constructor for JPA.
     */
    protected User() { /* do nothing */ }

    public User(String firstName, String lastName, String username, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
