package com.project.services;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    public String bookAppointment(int doctorId, int patientId, String date) {
        return "Appointment booked with Doctor ID " + doctorId + " for Patient ID " + patientId + " on " + date;
    }

    public String getAppointments() {
        return "Fetching all appointments...";
    }
}
