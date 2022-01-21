package com.citius.patientms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citius.patientms.entities.MasterAllergy;
import com.citius.patientms.service.MasterAllergyService;

@RestController
@RequestMapping("/masterAllergy")
public class MasterAllergyController {
	@Autowired
	private MasterAllergyService masterAllergyService;

	@GetMapping
	@CrossOrigin
	public List<MasterAllergy> getAllAllergies(){
		return masterAllergyService.getAllergies();
	}

	
	@PostMapping
	public MasterAllergy saveMasterAllergy(@RequestBody MasterAllergy master) {
		MasterAllergy saveMasterAllergy = masterAllergyService.saveMasterAllergy(master);
		return saveMasterAllergy;
		
	}
}
