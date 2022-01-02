package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.ClinicSearch;
import com.cts.repository.AppointmentRequestDao;
import com.cts.repository.PatientValidationDao;

@Service
public class PatientService {

	@Autowired
	private PatientValidationDao patientValidationDao;
	
	@Autowired
	private AppointmentRequestDao appointmentRequestDao;

	public PatientValidationDao getPatientValidationDao() {
		return patientValidationDao;
	}

	public void setPatientValidationDao(PatientValidationDao patientValidationDao) {
		this.patientValidationDao = patientValidationDao;
	}
	public boolean patientCredentialValidation(int username,String password){
		
		return (patientValidationDao.patientCredentialValidation(username, password));
	}
	
	public List<ClinicSearch> AppointmentStatus(int patientId){
		return (appointmentRequestDao.getAppointmentStatus(patientId));
	}
	
	
}
