package com.model;

public class AllergyDto {

	private int allergyId;
	   
    private MasterAllergyDto masterId;
    
    private String isAllergyFatal;

	

	public int getAllergyId() {
		return allergyId;
	}

	public void setAllergyId(int allergyId) {
		this.allergyId = allergyId;
	}

	public MasterAllergyDto getMasterId() {
		return masterId;
	}

	public void setMasterId(MasterAllergyDto masterId) {
		this.masterId = masterId;
	}

	public MasterAllergyDto getMaster_id() {
		return masterId;
	}

	public void setMaster_id(MasterAllergyDto master_id) {
		this.masterId = master_id;
	}

	public String getIsAllergyFatal() {
		return isAllergyFatal;
	}

	public void setIsAllergyFatal(String isAllergyFatal) {
		this.isAllergyFatal = isAllergyFatal;
	}
    
	
}
