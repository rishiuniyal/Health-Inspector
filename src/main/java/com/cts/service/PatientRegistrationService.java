package com.cts.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.repository.PatientRegistrationDao;

@Service
public class PatientRegistrationService {

	@Autowired
	private PatientRegistrationDao patientRegistrationDao;

	public PatientRegistrationDao getPatientRegistrationDao() {
		return patientRegistrationDao;
	}

	public void setPatientRegistrationDao(PatientRegistrationDao patientRegistrationDao) {
		this.patientRegistrationDao = patientRegistrationDao;
	}
	public int PatientRegistrationDetails(String first_name,String last_name,String Dob,String Gender,String Contact,String patient_Id,String Password,String email,String user_category){
		return patientRegistrationDao.patientRegistration(first_name,last_name,Dob,Gender,Contact,patient_Id,Password,email,user_category);
	}
	public  List<Integer> getPatientId(){
		return (patientRegistrationDao.PatientId());
	}
}
