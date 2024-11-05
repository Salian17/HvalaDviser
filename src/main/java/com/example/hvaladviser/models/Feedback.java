package com.example.hvaladviser.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

/**
 * This class represents the Feedback model, which stores user reviews and ratings for restaurants.
 *
 * @property id The unique identifier for the feedback.
 * @property total_count The total number of reviews submitted by the user.
 * @property position_in_top The position of the restaurant in the user's personal ranking.
 * @property food_rating The rating given by the user for the food (on a scale of 0.0 to 5.0).
 * @property atmosphere_rating The rating given by the user for the restaurant's atmosphere (on a scale of 0.0 to 5.0).
 * @property value_rating The rating given by the user for the value (price to quality ratio).
 * @property service_rating The rating given by the user for the service quality.
 * @property date The date when the feedback was submitted.
 * @property text The review text submitted by the user.
 *
 * @author Xenia
 */
@Entity
public class Feedback {

    private UUID id;
    private Integer total_count;
    private Integer position_in_top;
    private Double food_rating;
    private Double atmosphere_rating;
    private Double value_rating;
    private Double service_rating;
    private Date date;
    private String text;

    /**
     * Default constructor for JPA.
     */
    public Feedback() { /* do nothing */ }

    /**
     * Constructs a new {@code Feedback} instance with the provided attributes.
     *
     * @param id               The unique identifier for the feedback.
     * @param total_count      The total number of reviews submitted by the user.
     * @param position_in_top  The position of the restaurant in the user's personal ranking.
     * @param food_rating      The rating given by the user for the food.
     * @param atmosphere_rating The rating given by the user for the atmosphere.
     * @param value_rating     The rating given by the user for value.
     * @param service_rating   The rating given by the user for the service.
     * @param date             The date when the feedback was submitted.
     * @param text             The review text.
     */
    public Feedback(UUID id, Integer total_count, Integer position_in_top, Double food_rating, Double atmosphere_rating, Double value_rating, Double service_rating, Date date, String text) {
        this.id = id;
        this.total_count = total_count;
        this.position_in_top = position_in_top;
        this.food_rating = food_rating;
        this.atmosphere_rating = atmosphere_rating;
        this.value_rating = value_rating;
        this.service_rating = service_rating;
        this.date = date;
        this.text = text;
    }

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getPosition_in_top() {
        return position_in_top;
    }

    public void setPosition_in_top(Integer position_in_top) {
        this.position_in_top = position_in_top;
    }

    @NotNull(message = "Food rating is required")
    public Double getFood_rating() {
        return food_rating;
    }

    public void setFood_rating(Double food_rating) {
        this.food_rating = food_rating;
    }

    @NotNull(message = "Atmosphere rating is required")
    public Double getAtmosphere_rating() {
        return atmosphere_rating;
    }

    public void setAtmosphere_rating(Double atmosphere_rating) {
        this.atmosphere_rating = atmosphere_rating;
    }

    @NotNull(message = "Value rating is required")
    public Double getValue_rating() {
        return value_rating;
    }

    public void setValue_rating(Double value_rating) {
        this.value_rating = value_rating;
    }

    @NotNull(message = "Service rating is required")
    public Double getService_rating() {
        return service_rating;
    }

    public void setService_rating(Double service_rating) {
        this.service_rating = service_rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @NotBlank(message = "Text is required")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
