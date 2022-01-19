package com.citius.patientms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Demographic {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="demographic_id")
	private int id;
	@Column(name = "date_of_birth")
    private String birthDate;
   
    @Column(name = "age")
    private int age;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "race")
    private String race;
    
    @Column(name = "ethnicity")
    private String ethnicity;
    
    @Column(name = "languages")
    private String langKnown;
   
    @Column(name = "address")
    private String address;
   
    @Column(name = "emgr_title")
    private String emgrTitle;
   
    @Column(name = "emgr_fname")
    private String emgrFname;
   
    @Column(name = "emgr_lname")
    private String emgrLname;
   
    @Column(name = "emgr_email")
    private String emgrEmail;
    
    @Column(name = "emgr_contact_no")
    private String emgrContactNo;
    
    @Column(name = "emgr_relation")
    private String emgrRelation;
   
    @Column(name = "emgr_address")
    private String emgrAddress;
    
    @Column(name="access_patient_portal")
    private String ppp;
    
    @Column(name="have_allergies")
    private String allergyCheck;




	public int getId() {
		return id;
	}

	public void setId(int id) {
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
}
