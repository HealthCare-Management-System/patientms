package com.citius.patientms.models;

import com.citius.patientms.entities.MasterAllergy;

public class MasterAllergyDto {
	
	private long masterallergyId;
    
    private String allergyType;
   
    private String allergyName;
   
    private String allergyDescription;
   
    private String allergyClinicalInformation;

	public long getMasterallergyId() {
		return masterallergyId;
	}

	public void setMasterallergyId(long masterallergyId) {
		this.masterallergyId = masterallergyId;
	}

	public String getAllergyType() {
		return allergyType;
	}

	public void setAllergyType(String allergyType) {
		this.allergyType = allergyType;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyDescription() {
		return allergyDescription;
	}

	public void setAllergyDescription(String allergyDescription) {
		this.allergyDescription = allergyDescription;
	}

	public String getAllergyClinicalInformation() {
		return allergyClinicalInformation;
	}

	public void setAllergyClinicalInformation(String allergyClinicalInformation) {
		this.allergyClinicalInformation = allergyClinicalInformation;
	}
    
    MasterAllergy dtoToEntity(MasterAllergyDto dto) {
    	MasterAllergy m=new MasterAllergy();
    	m.setAllergyType(dto.getAllergyType());
    	m.setAllergyName(dto.getAllergyName());
    	m.setAllergyDescription(dto.getAllergyDescription());
    	m.setAllergyClinicalInformation(dto.getAllergyClinicalInformation());
    	return m;
    }
    
    MasterAllergyDto entityToDto(MasterAllergy m) {
    	MasterAllergyDto dto=new MasterAllergyDto();
    	dto.setAllergyClinicalInformation(m.getAllergyClinicalInformation());
    	dto.setAllergyDescription(m.getAllergyDescription());
    	dto.setAllergyName(m.getAllergyName());
    	dto.setAllergyType(dto.getAllergyType());
    	dto.setMasterallergyId(m.getMasterallergyId());
    	return dto;
    }
}
