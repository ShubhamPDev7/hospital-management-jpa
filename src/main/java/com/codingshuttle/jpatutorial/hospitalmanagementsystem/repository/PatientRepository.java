package com.codingshuttle.jpatutorial.hospitalmanagementsystem.repository;

import com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.BloodGroupStats;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.CPatientInfo;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.IPatientInfo;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.Patient;
import com.codingshuttle.jpatutorial.hospitalmanagementsystem.entity.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    @Query("select  patient.id as id, patient.name as name, patient.email as email from Patient patient")
    List<IPatientInfo> getAllPatientsInfo();

    @Query("select new com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.CPatientInfo(patient.id, patient.name) " + "from Patient patient")
    List<CPatientInfo> getAllPatientsInfoConcrete();

    @Query("select new com.codingshuttle.jpatutorial.hospitalmanagementsystem.dto.BloodGroupStats(patient.bloodGroup, " + "COUNT(patient)) from Patient patient  group by patient.bloodGroup  order by COUNT(patient)")
    List<BloodGroupStats> getBloodGroupStats();

    @Transactional
    @Modifying
    @Query("UPDATE Patient patient set patient.name = :name where patient.id = :id")
    int updatePatientNameWithId(@Param("name") String name, @Param("id") Long id);

}
