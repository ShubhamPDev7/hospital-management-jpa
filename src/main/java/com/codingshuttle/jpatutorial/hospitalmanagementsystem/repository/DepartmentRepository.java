package com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}