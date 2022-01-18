package com.citius.patientms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citius.patientms.entities.Demographic;
import com.citius.patientms.service.DemographicService;

@RestController
@RequestMapping("/demographics")
public class DemographicController {
	@Autowired
	private DemographicService service;

	@PatchMapping("/{id}")
	public Demographic updateDemographic(@PathVariable long id,@RequestBody Demographic demo) {
		return service.updateDemographic(id, demo);
	}
	
	@GetMapping
	public List<Demographic> fetchAllDemographic(){
	return service.getAll();
	}
}

