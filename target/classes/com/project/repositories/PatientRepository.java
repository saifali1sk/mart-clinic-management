package com.project.repositories;

import com.project.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Patient entities.
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can add custom query methods here if needed
}
