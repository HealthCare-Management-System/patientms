package com.citius.patientms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="allergy")
public class Allergy {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "allergy_id")
    private int allergyId;
   
    @OneToOne
    private MasterAllergy masterId;
    
    private String isAllergyFatal;


    
	
	public int getAllergyId() {
		return allergyId;
	}
	public void setAllergyId(int allergyId) {
		this.allergyId = allergyId;
	}
	public MasterAllergy getMasterId() {
		return masterId;
	}
	public void setMasterId(MasterAllergy masterId) {
		this.masterId = masterId;
	}
//	public MasterAllergy getMaster_id() {
//		return masterId;
//	}
//	public void setMaster_id(MasterAllergy master_id) {
//		this.masterId = master_id;
//	}
	public String getIsAllergyFatal() {
		return isAllergyFatal;
	}
	public void setIsAllergyFatal(String isAllergyFatal) {
		this.isAllergyFatal = isAllergyFatal;
	}
}
