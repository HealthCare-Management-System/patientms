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
		System.out.println("from saving list of master");
		List<MasterAllergy> saveAll = repo.saveAll(allergies);
		System.out.println("after saving list of masters");
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
	    	dto.setAllergyType(m.getAllergyType());
	    	dto.setMasterallergyId(m.getMasterallergyId());
	    	return dto;
	    }
		@Override
		public List<MasterAllergy> getAllergies() {
			return repo.findAll();
		}
		@Override
		public MasterAllergy saveMasterAllergy(MasterAllergy master) {
			int id = repo.getMaxTransactionId();

			MasterAllergy master1=new MasterAllergy();
			System.out.println("print id of medication " + id);
			master1.setMasterallergyId(id+1);
			master1.setAllergyClinicalInformation(master.getAllergyClinicalInformation());
			master1.setAllergyDescription(master.getAllergyDescription());
			master1.setAllergyName(master.getAllergyName());
			master1.setAllergyType(master.getAllergyType());
			
			
			
			MasterAllergy save = repo.save(master1);
			
			return save;
			
			}
		}


