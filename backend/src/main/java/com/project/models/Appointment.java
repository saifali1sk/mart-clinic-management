package com.project.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

/**
 * Represents an appointment between a patient and a doctor.
 */
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The doctor assigned to this appointment.
     */
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    /**
     * The patient who booked this appointment.
     */
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    /**
     * The scheduled time of the appointment.
     */
    @NotNull
    @Future
    private LocalDateTime appointmentTime;

    private String status;

    // Constructors
    public Appointment() {}

    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentTime, String status) {
        this.doctor = doctor;
        this.patient
