package com.project.staragile.service;

import com.project.staragile.entity.Doctor;
import com.project.staragile.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // Save a new doctor
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Update doctor by registration ID (String)
    public Doctor updateDoctor(String doctorRegNo, Doctor updatedDoctor) {
        Doctor existingDoctor = doctorRepository.findById(doctorRegNo).orElse(null);
        if (existingDoctor != null) {
            existingDoctor.setDoctorName(updatedDoctor.getDoctorName());
            existingDoctor.setDoctorSpeciality(updatedDoctor.getDoctorSpeciality());
            existingDoctor.setHospitalName(updatedDoctor.getHospitalName());
            return doctorRepository.save(existingDoctor);
        }
        return null;
    }

    // Delete doctor by registration ID (String)
    public void deleteDoctor(String doctorRegNo) {
        doctorRepository.deleteById(doctorRegNo);
    }

    // Search doctors by name
    public List<Doctor> findByName(String doctorName) {
        return doctorRepository.findByDoctorName(doctorName);
    }

    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}

