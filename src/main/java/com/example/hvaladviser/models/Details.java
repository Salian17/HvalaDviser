package com.example.hvaladviser.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

@Entity
public class Details {
    private UUID id;
    private String priceRange;
    private String about;
    private List<String> specialDiets;
    private List<String> features;
    private List<String> cuisines;
    private List<String> meals;

    protected Details() {}

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @ElementCollection
    public List<String> getSpecialDiets() {
        return specialDiets;
    }

    public void setSpecialDiets(List<String> specialDiets) {
        this.specialDiets = specialDiets;
    }

    @ElementCollection
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @ElementCollection
    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    @ElementCollection
    public List<String> getMeals() {
        return meals;
    }

    public void setMeals(List<String> meals) {
        this.meals = meals;
    }
}
