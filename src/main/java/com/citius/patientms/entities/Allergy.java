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
    private long allergyId;
   
    @OneToOne
    private MasterAllergy master_id;
    
    private String isAllergyFatal;
	public long getAllergyId() {
		return allergyId;
	}
	public void setAllergyId(long allergyId) {
		this.allergyId = allergyId;
	}
	
	public MasterAllergy getMaster_id() {
		return master_id;
	}
	public void setMaster_id(MasterAllergy master_id) {
		this.master_id = master_id;
	}
	public String getIsAllergyFatal() {
		return isAllergyFatal;
	}
	public void setIsAllergyFatal(String isAllergyFatal) {
		this.isAllergyFatal = isAllergyFatal;
	}
}
