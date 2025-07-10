package com.project.models;

public class Doctor {
    private int doctorId;
    private String name;
    private String specialty;
    private String availableTime;

    // Constructors
    public Doctor() {}

    public Doctor(int doctorId, String name, String specialty, String availableTime) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
        this.availableTime = availableTime;
    }

    // Getters and Setters
    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getAvailableTime() { return availableTime; }
    public void setAvailableTime(String availableTime) { this.availableTime = availableTime; }
}
