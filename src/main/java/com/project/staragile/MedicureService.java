package com.project.staragile;

import com.project.staragile.repository.MedicureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.staragile.entity.Doctor;
import com.project.staragile.repository.MedicureRepository; // 👈 Add this import!

@Service
public class MedicureService {

    @Autowired
    MedicureRepository doctorRepository;

    public Doctor registerDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor createDoctor() {
        Doctor doctor = new Doctor("MP1110", "Ashritha", "Neurologist", "15 Years", "Apollo");
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorDetails(String doctorRegistrationId) {
        return doctorRepository.findById(doctorRegistrationId).get();
    }

    public Doctor registerDummyDoctor() {
        return new Doctor("MP1110", "Ashritha", "Neurologist", "15 Years", "Apollo");
    }

    public String sayHello() {
        return "Hello from Doctor Ashritha";
    }
}

