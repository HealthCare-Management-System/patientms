package com.citius.patientms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patientdetails")
public class PatientDetailsController {

	@GetMapping("/ping")
	public String greetings() {
		return "Working";
	}
}
