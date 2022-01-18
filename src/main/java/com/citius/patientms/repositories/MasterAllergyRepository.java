package com.citius.patientms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citius.patientms.entities.MasterAllergy;
import com.citius.patientms.entities.PatientDetails;

public interface MasterAllergyRepository extends JpaRepository<MasterAllergy, Long> {

}
