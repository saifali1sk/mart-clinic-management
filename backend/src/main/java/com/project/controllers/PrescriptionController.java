package com.project.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @GetMapping
    public String getAllPrescriptions() {
        return "List of prescriptions";
    }

    @PostMapping
    public String addPrescription(@RequestBody String prescriptionData) {
        return "Prescription added: " + prescriptionData;
    }
}
