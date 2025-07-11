package com.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * Represents a doctor in the Smart Clinic Management System.
 */
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String specialty;
    private String availableTimes;

    // Constructors
    public Doctor() {}

    public Doctor(String name, String email, String specialty, String availableTimes) {
        this.name = name;
        this.email = email;
        this.specialty = specialty;
        this.availableTimes = availableTimes;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getAvailableTimes() { return availableTimes; }
    public
