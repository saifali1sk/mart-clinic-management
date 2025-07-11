package com.project.repositories;

import com.project.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Patient entities.
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    /**
     * Finds a patient by their email.
     */
    Patient findByEmail(String email);

    /**
     * Finds a patient by either email or phone number.
     */
    Patient findByEmailOrPhone(String email, String phone);
}
