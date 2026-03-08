package com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}