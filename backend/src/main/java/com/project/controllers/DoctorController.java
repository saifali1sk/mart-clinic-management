package com.project.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping
    public String getAllDoctors() {
        return "List of all doctors";
    }

    @PostMapping
    public String addDoctor(@RequestBody String doctorData) {
        return "Doctor added: " + doctorData;
    }
}
