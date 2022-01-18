package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.Demographic;

public interface DemographicService {

	Demographic saveDemographic(Demographic demo);

	Demographic updateDemographic(long id, Demographic demographic);

	List<Demographic> getAll();

}
