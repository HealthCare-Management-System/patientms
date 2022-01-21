package com.citius.patientms.service.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.patientms.entities.Allergy;
import com.citius.patientms.entities.MasterAllergy;
import com.citius.patientms.entities.PatientDetails;
import com.citius.patientms.repositories.AllergyRepository;
import com.citius.patientms.repositories.MasterAllergyRepository;
import com.citius.patientms.service.AllergyService;
import com.citius.patientms.service.MasterAllergyService;
import com.citius.patientms.service.PatientDetailsService;
import com.model.AllergyDto;
import com.model.PatientDetailsDto;

@Service
public class AllergyServiceImpl implements AllergyService{
	@Autowired
	private AllergyRepository repo;
	@Autowired
	private MasterAllergyRepository masterRepo;
	@Autowired
	private PatientDetailsService patientDetailsService;
	@Autowired
	private MasterAllergyService masterAllergyService;

	@Override
	public List<Allergy> saveAllAllergy(List<Allergy> allergies) {
		
		List<Allergy> allergies1=new ArrayList<>();		
		for(Allergy a1:allergies) {
			Allergy a=new Allergy();
			List<MasterAllergy> listOfAllergies= masterRepo.findByAllergyDescriptionAndAllergyClinicalInformationAndAllergyNameAndAllergyType(a1.getMasterId().getAllergyDescription(),a1.getMasterId().getAllergyClinicalInformation(),a1.getMasterId().getAllergyName(),a1.getMasterId().getAllergyType());
			if(listOfAllergies.size()!=0) {
				System.out.println(" object is present");
				a.setMasterId(listOfAllergies.get(0));
			}else {
				MasterAllergy saveMasterAllergy = masterAllergyService.saveMasterAllergy(a1.getMasterId());
				a.setMasterId(saveMasterAllergy);
				
			}
			a.setIsAllergyFatal(a1.getIsAllergyFatal());
			allergies1.add(a);
		}

		return repo.saveAll(allergies1);
		
	}

	@Override
	public void deleteAllergy(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public void deleteAllergiesByPatientId(int id) {
		PatientDetails patientDetailsById = patientDetailsService.getPatientDetailsById(id);
		PatientDetailsDto convertEntityToDto = patientDetailsService.convertEntityToDto(patientDetailsById);
		List<Allergy> allergies = patientDetailsById.getAllergies();
		allergies.clear();
		System.out.println(allergies);
		System.out.println(patientDetailsById.getDemographic().getId());
		System.out.println(patientDetailsById.getEmployeeId());
		patientDetailsById.setAllergies(allergies);
		//patientDetailsService.savePatientDetails(patientDetailsById);
		patientDetailsService.updatePatientDetailswithEntity(id, patientDetailsById);
		System.out.println(id);
		
	}
	
	public Allergy dtoTOEntity(AllergyDto dto) {
		Allergy a=new Allergy();
		a.setIsAllergyFatal(dto.getIsAllergyFatal());
		a.setMasterId(masterAllergyService.dtoToEntity(dto.getMasterId()));
		return a;
	}
	
	public AllergyDto entityToDto(Allergy a) {
		
		AllergyDto dto=new AllergyDto();
		dto.setAllergyId(a.getAllergyId());
		dto.setIsAllergyFatal(a.getIsAllergyFatal());
		dto.setMasterId(masterAllergyService.entityToDto(a.getMasterId()));
//		dto.setAllergyId(a.getAllergyId());
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
