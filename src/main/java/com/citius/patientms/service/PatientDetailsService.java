package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.PatientDetails;
import com.model.PatientDetailsDto;

public interface PatientDetailsService {

	 PatientDetails savePatientDetails(PatientDetailsDto dto);

	PatientDetailsDto getPatientDetailsByUserId(int userId);

	List<PatientDetails> getAll();

	PatientDetailsDto getById(int id);

	List<PatientDetailsDto> getAllPatientDetails();

	PatientDetails getPatientDetailsById(int id);
	PatientDetails savePatientDetails(PatientDetails details);

	public PatientDetailsDto updatePatientDetails(int id, PatientDetailsDto detailsdto);
	public PatientDetails convertDtoToEntity(PatientDetailsDto dto);
	public PatientDetailsDto convertEntityToDto(PatientDetails e);
	
}
