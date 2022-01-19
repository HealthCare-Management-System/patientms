package com.citius.patientms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.patientms.entities.Allergy;
import com.citius.patientms.entities.MasterAllergy;
import com.citius.patientms.entities.PatientDetails;
import com.citius.patientms.repositories.AllergyRepository;
import com.citius.patientms.service.AllergyService;
import com.citius.patientms.service.MasterAllergyService;
import com.citius.patientms.service.PatientDetailsService;
import com.model.AllergyDto;
import com.model.MasterAllergyDto;
import com.model.PatientDetailsDto;

@Service
public class AllergyServiceImpl implements AllergyService{
	@Autowired
	private AllergyRepository repo;
	@Autowired
	private PatientDetailsService patientDetailsService;
	@Autowired
	private MasterAllergyService masterAllergyService;

	@Override
	public List<Allergy> saveAllAllergy(List<Allergy> allergies) {
		List<MasterAllergy> m=new ArrayList<>();
		for(Allergy a:allergies) {
			m.add(a.getMaster_id());
		}
		masterAllergyService.saveAllMasterAllergy(m);
		List<Allergy> allergies1=new ArrayList<>();
		int i=0;
		for(Allergy a1:allergies) {
			Allergy n=new Allergy();
			n.setAllergyId(a1.getAllergyId());
			n.setIsAllergyFatal(a1.getIsAllergyFatal());
			n.setMaster_id(m.get(i));
			allergies1.add(n);
			i=i+1;
		}
//		masterAllergyService.saveAllMasterAllergy(m);

		return repo.saveAll(allergies1);
	}

	@Override
	public void deleteAllergy(long id) {
		repo.deleteById(id);
		
	}

	@Override
	public void deleteAllergiesByPatientId(long id) {
		PatientDetails patientDetailsById = patientDetailsService.getPatientDetailsById(id);
		PatientDetailsDto convertEntityToDto = patientDetailsService.convertEntityToDto(patientDetailsById);
		List<Allergy> allergies = patientDetailsById.getAllergies();
		allergies.clear();
		System.out.println(allergies);
		System.out.println(patientDetailsById.getDemographic().getId());
		System.out.println(patientDetailsById.getEmployeeId());
		patientDetailsById.setAllergies(allergies);
		//patientDetailsService.savePatientDetails(patientDetailsById);
		patientDetailsService.updatePatientDetails(id, convertEntityToDto);
		System.out.println(id);
		
	}
	
	public Allergy dtoTOEntity(AllergyDto dto) {
		Allergy a=new Allergy();
		a.setIsAllergyFatal(dto.getIsAllergyFatal());
		a.setMaster_id(masterAllergyService.dtoToEntity(dto.getMaster_id()));
		return a;
	}
	
	public AllergyDto entityToDto(Allergy a) {
		
		AllergyDto dto=new AllergyDto();
		dto.setAllergyId(a.getAllergyId());
		dto.setIsAllergyFatal(a.getIsAllergyFatal());
		dto.setMaster_id(masterAllergyService.entityToDto(a.getMaster_id()));
		return dto;
	}
	
	public List<Allergy> dtoTOEntityList(List<AllergyDto> ldto){
		List<Allergy> entitylist=new ArrayList<>();
		for(AllergyDto d:ldto) {
			entitylist.add(dtoTOEntity(d));
		}
		return entitylist;
	}
	public List<AllergyDto> entityToDtoList(List<Allergy> entity){
		List<AllergyDto> dtoList=new ArrayList<>();
		for(Allergy a:entity) {
			dtoList.add(entityToDto(a));
		}
		return dtoList;
	}

}
