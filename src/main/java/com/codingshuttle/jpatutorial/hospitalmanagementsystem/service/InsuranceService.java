package com.codingshuttle.jpatutorial.hospitalmanagementsystem.service;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Insurance;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Patient;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository.InsuranceRepository;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;

    private final PatientRepository patientRepository;

    @Transactional
    public Insurance assignInsuranceToPatient(Insurance insurance, Long patientId){

        Patient patient = patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);


        insurance.setPatient(patient); // Optional
        return insurance;


    }


}
