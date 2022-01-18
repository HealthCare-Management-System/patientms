package com.citius.patientms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.patientms.entities.MasterAllergy;
import com.citius.patientms.repositories.MasterAllergyRepository;
import com.citius.patientms.service.MasterAllergyService;

@Service
public class MasterAllergyServiceImpl implements MasterAllergyService{
	@Autowired
	private MasterAllergyRepository repo;

	@Override
	public List<MasterAllergy> saveAllMasterAllergy(List<MasterAllergy> allergies) {
		List<MasterAllergy> saveAll = repo.saveAll(allergies);
		return saveAll;
	}

}
