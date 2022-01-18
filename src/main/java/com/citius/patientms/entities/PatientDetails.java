package com.citius.patientms.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long patientDetails;
	@OneToOne
	private Demographic demographic;
//	@OneToOne
//	@JoinColumn(name="employee_id",nullable=false)
	private int employeeId;
	
	@OneToMany
	@JoinColumn(name="patient_id", nullable=true)
	private List<Allergy> allergies =new ArrayList<Allergy>();

	public long getPatientDetails() {
		return patientDetails;
	}

	public void setPatientDetails(long patientDetails) {
		this.patientDetails = patientDetails;
	}

	public Demographic getDemographic() {
		return demographic;
	}

	public void setDemographic(Demographic demographic) {
		this.demographic = demographic;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public List<Allergy> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}
	
}
