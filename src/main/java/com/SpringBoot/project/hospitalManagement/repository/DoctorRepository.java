package com.SpringBoot.project.hospitalManagement.repository;

import com.SpringBoot.project.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}