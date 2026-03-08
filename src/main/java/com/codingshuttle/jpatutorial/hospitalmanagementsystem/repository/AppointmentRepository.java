package com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}