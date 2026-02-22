package com.SpringBoot.project.hospitalManagement.repository;

import com.SpringBoot.project.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}