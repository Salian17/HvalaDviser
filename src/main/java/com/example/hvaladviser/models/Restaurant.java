package com.example.hvaladviser.models;

import com.example.hvaladviser.enums.AverageBillsEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.UUID;

/**
 * This class representing Restaurant model.
 *
 * @property id The id of restaurant.
 * @property averageBillsEnum The average bill in restaurant.
 * @property openHours The hours when restaurant opened.
 *
 * @author Salian17
 */
@Entity
public class Restaurant {
    private UUID id;
    private AverageBillsEnum averageBillsEnum;
    private List<String> openHours;

    /**
     * Protected constructor for JPA.
     */
    protected Restaurant() {/** do nothing*/}

    /**
     * Constructs a new {@code Restaurant} instance with the provided attributes.
     *
     * @param id                the unique identifier of the restaurant
     * @param averageBillsEnum  the average bills of the restaurant
     * @param openHours         the open hours of the restaurant
     *
     */
    public Restaurant(UUID id, AverageBillsEnum averageBillsEnum, List<String> openHours) {
        this.id = id;
        this.averageBillsEnum = averageBillsEnum;
        this.openHours = openHours;
    }

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Average bills required")
    public AverageBillsEnum getAverageBillsEnum() {
        return averageBillsEnum;
    }

    public void setAverageBillsEnum(AverageBillsEnum averageBillsEnum) {
        this.averageBillsEnum = averageBillsEnum;
    }

    @ElementCollection
    @NotBlank(message = "Open hours required")
    public List<String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(List<String> openHours) {
        this.openHours = openHours;
    }
}
