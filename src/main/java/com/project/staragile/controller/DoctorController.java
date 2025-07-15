package com.project.staragile.controller;

import com.project.staragile.entity.Doctor;
import com.project.staragile.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/registerDoctor")
    public Doctor registerDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @PutMapping("/updateDoctor/{doctorRegNo}")
    public Doctor updateDoctor(@PathVariable String doctorRegNo, @RequestBody Doctor doctor) {
        return doctorService.updateDoctor(doctorRegNo, doctor);
    }

    @DeleteMapping("/deletePolicy/{doctorRegNo}")
    public void deleteDoctor(@PathVariable String doctorRegNo) {
        doctorService.deleteDoctor(doctorRegNo);
    }

    @GetMapping("/searchDoctor/{doctorName}")
    public List<Doctor> searchDoctor(@PathVariable String doctorName) {
        return doctorService.findByName(doctorName);
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}

