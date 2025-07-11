package com.project.services;

import com.project.models.Doctor;
import com.project.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Service class for managing doctor-related operations.
 */
@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    /**
     * Adds a new doctor to the system.
     */
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    /**
     * Retrieves all doctors.
     */
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    /**
     * Retrieves available time slots for a doctor on a specific date.
     */
    public List<String> getAvailabilityByDoctorAndDate(Long doctorId, LocalDate date) {
        // Placeholder logic — replace with actual availability lookup
        return List.of("10:00 AM", "11:30 AM", "2:00 PM");
    }

    /**
     * Validates login credentials for a doctor.
     */
    public boolean validateDoctorLogin(String email, String password) {
        Doctor doctor = doctorRepository.findByEmail(email);
        return doctor != null && doctor.getPassword().equals(password);
    }
}
