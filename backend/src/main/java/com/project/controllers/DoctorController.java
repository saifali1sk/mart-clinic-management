package com.project.controllers;

import com.project.models.Doctor;
import com.project.repositories.DoctorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorRepository repo;

    public DoctorController(DoctorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Doctor> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Doctor create(@RequestBody Doctor doctor) {
        return repo.save(doctor);
    }
}
