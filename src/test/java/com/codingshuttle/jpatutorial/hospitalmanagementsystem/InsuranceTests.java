package com.codingshuttle.jpatutorial.hospitalmanagementsystem;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Appointment;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Insurance;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.service.AppointmentService;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.service.InsuranceService;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTests {



    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PatientService patientService;

    @Test
    public void testAssignInsuranceToPatient() {
        Insurance insurance = Insurance.builder()
                .provider("HDFC Ergo")
                .policyNumber("HDFC_999")
                .validUntil(LocalDate.of(2030, 1, 1))
                .build();

        var updatedInsurance = insuranceService.assignInsuranceToPatient(insurance, 1L);

        System.out.println(updatedInsurance);

        patientService.deletePatient(1L);
    }

    @Test
    public void testCreateAppointment() {
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025, 11, 1, 14, 0, 0))
                .reason("Cancer")
                .build();

        var updatedAppointment = appointmentService.createANewAppointment(appointment, 1L, 2L);
        System.out.println(updatedAppointment);

        patientService.deletePatient(1L);
    }

}
