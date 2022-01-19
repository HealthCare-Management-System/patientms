package com.citius.patientms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citius.patientms.entities.Demographic;
import com.citius.patientms.entities.MasterAllergy;

public interface DemographicRepository extends JpaRepository<Demographic, Integer> {

}
