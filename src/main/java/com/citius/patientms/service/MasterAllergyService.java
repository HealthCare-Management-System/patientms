package com.citius.patientms.service;

import java.util.List;


import com.citius.patientms.entities.MasterAllergy;
import com.model.MasterAllergyDto;

public interface MasterAllergyService {
	List<MasterAllergy> saveAllMasterAllergy(List<MasterAllergy> allergies);
	  MasterAllergy dtoToEntity(MasterAllergyDto dto);
MasterAllergyDto entityToDto(MasterAllergy m);
}
