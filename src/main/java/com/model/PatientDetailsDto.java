package com.model;

import java.util.List;

import com.citius.patientms.entities.Allergy;
import com.citius.patientms.entities.Demographic;

public class PatientDetailsDto {

	private long id;
	
	private UserDto user;
	private DemographicDto demographic;
	private List<AllergyDto> allergies;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public DemographicDto getDemographic() {
		return demographic;
	}
	public void setDemographic(DemographicDto demographic) {
		this.demographic = demographic;
	}
	public List<AllergyDto> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<AllergyDto> allergies) {
		this.allergies = allergies;
	}
	
	
}
