package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.PatientDetails;
import com.citius.patientms.models.PatientDetailsDto;

public interface PatientDetailsService {

	 PatientDetails savePatientDetails(PatientDetailsDto dto);

	PatientDetailsDto getPatientDetailsByUserId(long userId);

	List<PatientDetails> getAll();

	PatientDetailsDto getById(long id);

	List<PatientDetailsDto> getAllPatientDetails();

	PatientDetails getPatientDetailsById(long id);
	PatientDetails savePatientDetails(PatientDetails details);

	PatientDetails updatePatientDetails(long id, PatientDetails dto);
}
