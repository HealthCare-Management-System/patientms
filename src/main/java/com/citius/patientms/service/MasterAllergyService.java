package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.MasterAllergy;

public interface MasterAllergyService {
	List<MasterAllergy> saveAllMasterAllergy(List<MasterAllergy> allergies);
}
