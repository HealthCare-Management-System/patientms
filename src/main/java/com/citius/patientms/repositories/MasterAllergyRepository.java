package com.citius.patientms.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.citius.patientms.entities.MasterAllergy;


public interface MasterAllergyRepository extends JpaRepository<MasterAllergy, Integer> {
//	@Query("Select from Allergy where patientId=pid")
//	 public void deleteAllAllergyByPatientId(@Param("pid") Long id);
//  @Query(value = "select * FROM notes n INNER JOIN staff_details s on s.user_id = n.sender_user_id INNER Join roles r on s.role_id = r.role_Id where n.sender_user_id = :sender_user_id AND isdeleted=false", nativeQuery = true)
//  List<Notes> findByAll(final int sender_user_id);
	

    List<MasterAllergy> findByAllergyDescriptionAndAllergyClinicalInformationAndAllergyNameAndAllergyType(String allergyDescrption,String allergyClinicalInformation,String allergyName,String allergyType);
    @Query(value = "SELECT max(masterallergyId) FROM MasterAllergy")
	int getMaxTransactionId();
//    @Query(value = "SELECT coalesce(max(id), 0) FROM Medication")
//	int getMaxTransactionId();

}
