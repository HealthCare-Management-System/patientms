package com.citius.patientms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.patientms.entities.Demographic;
import com.citius.patientms.repositories.DemographicRepository;
import com.citius.patientms.service.DemographicService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.model.DemographicDto;

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
	public Demographic updateDemographic(int id, Demographic demo) {
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
