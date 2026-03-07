package com.codingshuttle.jpatutorial.hospitalmanagementsystem;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.BloodGroupStats;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.CPatientInfo;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.IPatientInfo;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Patient;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository.PatientRepository;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatient() {
//        List<Patient> patientList = patientRepository.findAll();
//        List<CPatientInfo> patientList = patientRepository.getAllPatientsInfoConcrete();
//        List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();
//
//        for (var patient : patientList) {
//            System.out.println(patient);
//        }
//        int rowsAffected = patientRepository.updatePatientNameWithId("Anuj Sharma", 1L);
//
//        System.out.println(rowsAffected);
//
//        Patient patient = new  Patient();
//        patientRepository.save(patient);

        patientService.testPatientTransaction();



    }
}
