package com.citius.patientms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citius.patientms.entities.PatientDetails;
import com.citius.patientms.service.PatientDetailsService;
import com.model.PatientDetailsDto;



@RestController
@RequestMapping("/patientdetails")
public class PatientDetailsController {
	@Autowired 
	private PatientDetailsService service;

	@GetMapping("/ping")
	public String greetings() {
		return "Working";
	}
	@PostMapping
	@CrossOrigin
	public void savePatientDetails(@RequestBody PatientDetailsDto dto) {
	//	System.out.println(dto.getAllergies().get(0));
	service.savePatientDetails(dto);	
	}
	@GetMapping("/user/{userId}")
	@CrossOrigin
	private PatientDetailsDto getPatientDetailsByUserId(@PathVariable int userId) {
		//return service.getPatientDetailsById(user);
		System.out.println(userId);
	 return service.getPatientDetailsByUserId(userId);
		
		
		
	}
	@GetMapping("/all")
	private List<PatientDetails> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	public PatientDetailsDto getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping("/allPatientDetails")
	@CrossOrigin
	private List<PatientDetailsDto> getAllPatientDetails(){
		
		return service.getAllPatientDetails();
	}
	@PatchMapping("/update/{id}")
	@CrossOrigin
	public PatientDetailsDto updatePatientDetails(@PathVariable int id,@RequestBody PatientDetailsDto dto) {
		System.out.println("from frontend");
		System.out.println(dto.getAllergies());
		System.out.println(dto);
		System.out.println(id);
//		return null;
		return  service.updatePatientDetails(id,dto);
	}
}
