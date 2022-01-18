package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.Allergy;

public interface AllergyService {

	public List<Allergy> saveAllAllergy(List<Allergy> allergies);

	public void deleteAllergy(long id);

	public void deleteAllergiesByPatientId(long id);
}
