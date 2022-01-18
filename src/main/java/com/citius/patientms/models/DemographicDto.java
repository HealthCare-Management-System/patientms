package com.citius.patientms.models;

import javax.persistence.Column;

import com.citius.patientms.entities.Demographic;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class DemographicDto {

	private long id;

	private String birthDate;

	private int age;

	private String gender;

	private String race;

	private String ethnicity;

	private String langKnown;

	private String address;

	private String emgrTitle;

	private String emgrFname;

	private String emgrLname;

	private String emgrEmail;

	private String emgrContactNo;

	private String emgrRelation;

	private String emgrAddress;

	private String ppp;

	private String allergyCheck;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getLangKnown() {
		return langKnown;
	}

	public void setLangKnown(String langKnown) {
		this.langKnown = langKnown;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmgrTitle() {
		return emgrTitle;
	}

	public void setEmgrTitle(String emgrTitle) {
		this.emgrTitle = emgrTitle;
	}

	public String getEmgrFname() {
		return emgrFname;
	}

	public void setEmgrFname(String emgrFname) {
		this.emgrFname = emgrFname;
	}

	public String getEmgrLname() {
		return emgrLname;
	}

	public void setEmgrLname(String emgrLname) {
		this.emgrLname = emgrLname;
	}

	public String getEmgrEmail() {
		return emgrEmail;
	}

	public void setEmgrEmail(String emgrEmail) {
		this.emgrEmail = emgrEmail;
	}

	public String getEmgrContactNo() {
		return emgrContactNo;
	}

	public void setEmgrContactNo(String emgrContactNo) {
		this.emgrContactNo = emgrContactNo;
	}

	public String getEmgrRelation() {
		return emgrRelation;
	}

	public void setEmgrRelation(String emgrRelation) {
		this.emgrRelation = emgrRelation;
	}

	public String getEmgrAddress() {
		return emgrAddress;
	}

	public void setEmgrAddress(String emgrAddress) {
		this.emgrAddress = emgrAddress;
	}

	public String getPpp() {
		return ppp;
	}

	public void setPpp(String ppp) {
		this.ppp = ppp;
	}

	public String getAllergyCheck() {
		return allergyCheck;
	}

	public void setAllergyCheck(String allergyCheck) {
		this.allergyCheck = allergyCheck;
	}
	@JsonIgnore
	public Demographic dtoTOEntity(DemographicDto dto) {
		Demographic demo=new Demographic();
		demo.setAddress(dto.getAddress());
		demo.setAge(dto.getAge());
		demo.setAllergyCheck(dto.getAllergyCheck());
		demo.setBirthDate(dto.getBirthDate());
		demo.setEmgrAddress(dto.getEmgrAddress());
		demo.setEmgrContactNo(dto.getEmgrContactNo());
		demo.setEmgrEmail(dto.getEmgrEmail());
		demo.setEmgrFname(demo.getEmgrFname());
		demo.setEmgrLname(dto.getEmgrLname());
		demo.setEmgrRelation(dto.getEmgrRelation());
		demo.setEmgrTitle(dto.getEmgrTitle());
		demo.setEthnicity(dto.getEthnicity());
		demo.setGender(dto.getGender());
		demo.setLangKnown(dto.getLangKnown());
		demo.setPpp(dto.getPpp());
		demo.setRace(dto.getRace());
		return demo;
	}

	@JsonIgnore
	public DemographicDto entityToDto(Demographic demo) {
		DemographicDto dto=new DemographicDto();
		dto.setAddress(demo.getAddress());
		dto.setAge(demo.getAge());
		dto.setAllergyCheck(demo.getAllergyCheck());
		dto.setBirthDate(demo.getBirthDate());
		dto.setEmgrAddress(demo.getEmgrAddress());
		dto.setEmgrContactNo(demo.getEmgrContactNo());
		dto.setEmgrEmail(demo.getEmgrEmail());
		dto.setEmgrFname(demo.getEmgrFname());
		dto.setEmgrLname(demo.getEmgrLname());
		dto.setEmgrRelation(demo.getEmgrRelation());
		dto.setEmgrTitle(demo.getEmgrTitle());
		dto.setEthnicity(demo.getEthnicity());
		dto.setGender(demo.getGender());
		dto.setLangKnown(demo.getLangKnown());
		dto.setPpp(demo.getPpp());
		dto.setRace(demo.getRace());
		dto.setId(demo.getId());
		return dto;
	}
}
