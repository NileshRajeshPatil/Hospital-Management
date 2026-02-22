package com.SpringBoot.project.hospitalManagement.repository;

import com.SpringBoot.project.hospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}