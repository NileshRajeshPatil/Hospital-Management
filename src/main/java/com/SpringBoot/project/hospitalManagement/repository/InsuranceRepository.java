package com.SpringBoot.project.hospitalManagement.repository;

import com.SpringBoot.project.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}