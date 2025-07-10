package com.project.services;

import org.springframework.stereotype.Service;
import com.project.models.Doctor;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    private List<Doctor> doctorList = new ArrayList<>();

    public List<Doctor> getAllDoctors() {
        return doctorList;
    }

    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }
}
