package com.project.staragile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @Column(name = "doctorId")
    private String doctorId;

    @Column(name = "doctorRegistrationId")
    private String doctorRegistrationId;

    @Column(name = "doctorName")
    private String doctorName;

    @Column(name = "doctorSpeciality")
    private String doctorSpeciality;

    @Column(name = "hospitalName")
    private String hospitalName;

    // No-arg constructor
    public Doctor() {
    }

    // All-args constructor
    public Doctor(String doctorId, String doctorRegistrationId, String doctorName, String doctorSpeciality, String hospitalName) {
        this.doctorId = doctorId;
        this.doctorRegistrationId = doctorRegistrationId;
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.hospitalName = hospitalName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorRegistrationId() {
        return doctorRegistrationId;
    }

    public void setDoctorRegistrationId(String doctorRegistrationId) {
        this.doctorRegistrationId = doctorRegistrationId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}

