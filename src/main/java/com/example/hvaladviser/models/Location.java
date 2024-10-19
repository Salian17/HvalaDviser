package com.example.hvaladviser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

/**
 * Represents the location and contact details of a business or entity.
 * This entity is used to store phone numbers, websites, emails,
 * addresses, and geographical coordinates of a location.
 *
 * @property  id         the unique identifier of the location
 * @property phone      the phone number of the location
 * @property website    the website URL of the location
 * @property email      the email address of the location
 * @property location   the physical address of the location
 * @property coordinate the geographical coordinates of the location
 *
 */
@Entity
public class Location {
    @Id
    private UUID id;
    private String phone;
    private String website;
    private String email;
    private String location;
    private String coordinate;

    /**
     * Protected constructor for JPA.
     */
    public Location() { /* do nothing */}

    /**
     * Constructs a new {@code Location} instance with the provided attributes.
     *
     * @param id         the unique identifier of the location
     * @param phone      the phone number of the location
     * @param website    the website URL of the location
     * @param email      the email address of the location
     * @param location   the physical address of the location
     * @param coordinate the geographical coordinates of the location
     */
    public Location(UUID id, String phone, String website, String email, String location, String coordinate) {
        this.id = id;
        this.phone = phone;
        this.website = website;
        this.email = email;
        this.location = location;
        this.coordinate = coordinate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoordinate() {
        return coordinate;
    }


    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
}
