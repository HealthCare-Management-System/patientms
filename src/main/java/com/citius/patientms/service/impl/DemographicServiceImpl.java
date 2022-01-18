package com.citius.patientms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.patientms.entities.Demographic;
import com.citius.patientms.repositories.DemographicRepository;
import com.citius.patientms.service.DemographicService;

@Service
public class DemographicServiceImpl implements DemographicService {

	@Autowired
	public DemographicRepository repo;

	@Override
	public Demographic saveDemographic(Demographic demo) {
		Demographic save = repo.save(demo);
		return save;
	}

	@Override
	public Demographic updateDemographic(long id, Demographic demo) {
		System.out.println(id);
		Demographic demographic =  repo.findById(id).get();
		demographic.setAddress(demo.getAddress());
		demographic.setBirthDate(demo.getBirthDate());
		demographic.setAge(demo.getAge());
		demographic.setAllergyCheck(demo.getAllergyCheck());
		demographic.setEmgrAddress(demo.getEmgrAddress());
		demographic.setEmgrContactNo(demo.getEmgrContactNo());
		demographic.setEmgrEmail(demo.getEmgrEmail());
		demographic.setEmgrFname(demo.getEmgrFname());
		demographic.setEmgrLname(demo.getEmgrLname());
		demographic.setEmgrRelation(demo.getEmgrRelation());
		demographic.setEmgrTitle(demo.getEmgrTitle());
		demographic.setEthnicity(demo.getEthnicity());
		demographic.setGender(demo.getGender());
		demographic.setLangKnown(demo.getLangKnown());
		demographic.setPpp(demo.getPpp());
//		demographic.setId(demo.getId());
		return repo.save(demographic);
//		return null;
	}

	@Override
	public List<Demographic> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
