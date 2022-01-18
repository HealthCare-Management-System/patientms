package com.citius.patientms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citius.patientms.entities.Allergy;
import com.citius.patientms.entities.PatientDetails;

public interface AllergyRepository extends JpaRepository<Allergy, Long>{

}
