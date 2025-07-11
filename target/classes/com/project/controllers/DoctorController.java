package com.project.controllers;

import com.project.models.Doctor;
import com.project.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Handles doctor-related API endpoints.
 */
@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Existing CRUD endpoints...

    /**
     * Retrieves availability for a specific doctor based on user role, doctor ID, and date.
     * Requires a valid Authorization token.
     */
    @GetMapping("/availability")
    public ResponseEntity<List<String>> getDoctorAvailability(
            @RequestHeader("Authorization") String token,
            @RequestParam("role") String role,
            @RequestParam("doctorId") Long doctorId,
            @RequestParam("date") String dateStr
    ) {
        // Parse the date
        LocalDate date = LocalDate.parse(dateStr);

        // Validate token and role (simplified for demo)
        if (!doctorService.isAuthorized(token, role)) {
            return ResponseEntity.status(403).build(); // Forbidden
        }

        // Fetch availability
        List<String> availableSlots = doctorService.getAvailabilityByDoctorAndDate(doctorId, date);
        return ResponseEntity.ok(availableSlots);
    }
}
