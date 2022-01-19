package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.Allergy;
import com.model.AllergyDto;

public interface AllergyService {

	public List<Allergy> saveAllAllergy(List<Allergy> allergies);

	public void deleteAllergy(int id);

	public void deleteAllergiesByPatientId(int id);
	Allergy dtoTOEntity(AllergyDto dto);
	AllergyDto entityToDto(Allergy a);
	public List<Allergy> dtoTOEntityList(List<AllergyDto> ldto);
	public List<AllergyDto> entityToDtoList(List<Allergy> entity);
	
}
