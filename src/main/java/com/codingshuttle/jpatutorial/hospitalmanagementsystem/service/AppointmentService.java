package com.codingshuttle.jpatutorial.hospitalmanagementsystem.service;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Appointment;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Doctor;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Patient;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository.AppointmentRepository;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository.DoctorRepository;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId){
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointmentRepository.save(appointment);
        return appointment;
    }
}
