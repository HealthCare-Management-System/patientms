package com.citius.patientms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.patientms.entities.MasterAllergy;
import com.citius.patientms.repositories.MasterAllergyRepository;
import com.citius.patientms.service.MasterAllergyService;
import com.model.MasterAllergyDto;

@Service
public class MasterAllergyServiceImpl implements MasterAllergyService{
	@Autowired
	private MasterAllergyRepository repo;

	@Override
	public List<MasterAllergy> saveAllMasterAllergy(List<MasterAllergy> allergies) {
		List<MasterAllergy> saveAll = repo.saveAll(allergies);
		return saveAll;
	}
	 public  MasterAllergy dtoToEntity(MasterAllergyDto dto) {
	    	MasterAllergy m=new MasterAllergy();
	    	m.setAllergyType(dto.getAllergyType());
	    	m.setAllergyName(dto.getAllergyName());
	    	m.setAllergyDescription(dto.getAllergyDescription());
	    	m.setAllergyClinicalInformation(dto.getAllergyClinicalInformation());
	    	return m;
	    }
	    
	    public MasterAllergyDto entityToDto(MasterAllergy m) {
	    	MasterAllergyDto dto=new MasterAllergyDto();
	    	dto.setAllergyClinicalInformation(m.getAllergyClinicalInformation());
	    	dto.setAllergyDescription(m.getAllergyDescription());
	    	dto.setAllergyName(m.getAllergyName());
	    	dto.setAllergyType(dto.getAllergyType());
	    	dto.setMasterallergyId(m.getMasterallergyId());
	    	return dto;
	    }

}
