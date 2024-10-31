package com.example.hvaladviser.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.UUID;

/**
 * This class representing Details model.
 *
 * @property id The id of Details.
 * @property priceRange The price range in restaurant.
 * @property openHours The info about restaurant.
 * @property specialDiets The special diets in restaurant.
 * @property features The features in restaurant.
 * @property cuisines The cuisines in restaurant.
 * @property meals The meals in restaurant.
 *
 * @author Salian17
 */

@Entity
public class Details {
    private UUID id;
    private String priceRange;
    private String about;
    private List<String> specialDiets;
    private List<String> features;
    private List<String> cuisines;
    private List<String> meals;

    /**
     *  Protected constructor for JPA.
      */
    protected Details() {/** do nothing */}

    /**
     * Constructs a new {@code Details} instance with the provided attributes.
     *
     * @param id            the unique identifier of the details
     * @param priceRange    the price range of the restaurant
     * @param about         the info about of the restaurant
     * @param specialDiets  the special diets of the restaurant
     * @param features      the features of the restaurant
     * @param cuisines      the cuisines of the restaurant
     * @param meals         the meals of the restaurant
     *
     */
    public Details(UUID id, String priceRange, String about, List<String> specialDiets, List<String> features, List<String> cuisines, List<String> meals) {
        this.id = id;
        this.priceRange = priceRange;
        this.about = about;
        this.specialDiets = specialDiets;
        this.features = features;
        this.cuisines = cuisines;
        this.meals = meals;
    }

    @Id
    @GeneratedValue
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    @NotBlank(message = "Price range required")
    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    @NotBlank(message = "Info about restaurant required")
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @ElementCollection
    @NotBlank(message = "Special diets required")
    public List<String> getSpecialDiets() {
        return specialDiets;
    }

    public void setSpecialDiets(List<String> specialDiets) {
        this.specialDiets = specialDiets;
    }

    @ElementCollection
    @NotBlank(message = "Features required")
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @ElementCollection
    @NotBlank(message = "Cuisines required")
    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    @ElementCollection
    @NotBlank(message = "Meals required")
    public List<String> getMeals() {
        return meals;
    }

    public void setMeals(List<String> meals) {
        this.meals = meals;
    }
}
