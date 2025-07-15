package com.project.staragile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.staragile.entity.Doctor;

@Repository
public interface MedicureRepository extends JpaRepository<Doctor, String> {

}

