package com.citius.patientms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "master_allergy")
public class MasterAllergy {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "master_allergy_id")
    private int masterallergyId;
    @Column(name = "allergy_type")
    private String allergyType;
    @Column(name = "allergy_name")
    private String allergyName;
    @Column(name = "allergy_description")
    private String allergyDescription;
    @Column(name = "allergy_clinical")
    private String allergyClinicalInformation;

	public int getMasterallergyId() {
		return masterallergyId;
	}
	public void setMasterallergyId(int masterallergyId) {
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
    
}
