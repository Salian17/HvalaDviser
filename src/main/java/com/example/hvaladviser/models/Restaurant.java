package com.example.hvaladviser.models;

import com.example.hvaladviser.enums.AverageBillsEnum;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Restaurant {
    private UUID id;
    private AverageBillsEnum averageBillsEnum;
    private List<String> openHours;

    protected Restaurant() {}

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Enumerated(EnumType.STRING)
    public AverageBillsEnum getAverageBillsEnum() {
        return averageBillsEnum;
    }

    public void setAverageBillsEnum(AverageBillsEnum averageBillsEnum) {
        this.averageBillsEnum = averageBillsEnum;
    }

    @ElementCollection
    public List<String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(List<String> openHours) {
        this.openHours = openHours;
    }
}
