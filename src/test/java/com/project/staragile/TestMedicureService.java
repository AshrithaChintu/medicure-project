package com.project.staragile;

import com.project.staragile.entity.Doctor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMedicureService {

    @Autowired
    MedicureService doctorService;

    @Test
    public void testRegisterDoctor() {
        Doctor doctor = new Doctor("MP1110", "Ashritha", "Neurologist","Apollo Hospital ","15 Years");

        // Using getDoctorId instead of getDoctorRegistrationId
        assertEquals(doctor.getDoctorId(), doctorService.registerDummyDoctor().getDoctorId());
    }
}

