package com.citius.patientms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citius.patientms.service.AllergyService;
@RestController
@RequestMapping("/allergy")
public class AllergyController {
	
	
	@Autowired
	private AllergyService allergyService;
	@DeleteMapping("/{id}")
	@CrossOrigin
	public void  deleteById(@PathVariable int id) {
//		System.out.println(id);
		allergyService.deleteAllergy(id);
		
	}
	
	
	@DeleteMapping("/allergies/{id}")
	@CrossOrigin
	public void deleteAllergiesByPatientId(@PathVariable int id) {
		allergyService.deleteAllergiesByPatientId(id);
	}

}
