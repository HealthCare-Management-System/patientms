package com.citius.patientms.models;

import java.util.ArrayList;
import java.util.List;

import com.citius.patientms.entities.Allergy;
import com.citius.patientms.entities.MasterAllergy;
public class AllergyDto {

	private long allergyId;
	   
    private MasterAllergyDto master_id;
    
    private String isAllergyFatal;

	public long getAllergyId() {
		return allergyId;
	}

	public void setAllergyId(long allergyId) {
		this.allergyId = allergyId;
	}

	public MasterAllergyDto getMaster_id() {
		return master_id;
	}

	public void setMaster_id(MasterAllergyDto master_id) {
		this.master_id = master_id;
	}

	public String getIsAllergyFatal() {
		return isAllergyFatal;
	}

	public void setIsAllergyFatal(String isAllergyFatal) {
		this.isAllergyFatal = isAllergyFatal;
	}
    
	Allergy dtoTOEntity(AllergyDto dto) {
		Allergy a=new Allergy();
		MasterAllergyDto m=new MasterAllergyDto();
		a.setIsAllergyFatal(dto.getIsAllergyFatal());
		a.setMaster_id(m.dtoToEntity(dto.getMaster_id()));
		return a;
	}
	
	AllergyDto entityToDto(Allergy a) {
		MasterAllergyDto m=new MasterAllergyDto();
		AllergyDto dto=new AllergyDto();
		dto.setAllergyId(a.getAllergyId());
		dto.setIsAllergyFatal(a.getIsAllergyFatal());
		dto.setMaster_id(m.entityToDto(a.getMaster_id()));
		return dto;
	}
	
	public List<Allergy> dtoTOEntityList(List<AllergyDto> ldto){
		List<Allergy> entitylist=new ArrayList<>();
		for(AllergyDto d:ldto) {
			entitylist.add(dtoTOEntity(d));
		}
		return entitylist;
	}
	public List<AllergyDto> entityToDtoList(List<Allergy> entity){
		List<AllergyDto> dtoList=new ArrayList<>();
		for(Allergy a:entity) {
			dtoList.add(entityToDto(a));
		}
		return dtoList;
	}
}
