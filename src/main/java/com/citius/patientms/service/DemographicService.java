package com.citius.patientms.service;

import java.util.List;

import com.citius.patientms.entities.Demographic;
import com.model.DemographicDto;

public interface DemographicService {

	Demographic saveDemographic(Demographic demo);

	Demographic updateDemographic(long id, Demographic demo);

	List<Demographic> getAll();
	public Demographic dtoTOEntity(DemographicDto dto);
	public DemographicDto entityToDto(Demographic demo);

}
