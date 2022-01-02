package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.ClinicSearch;
import com.cts.model.PatientDetails;
import com.cts.repository.AdminValidationDao;
import com.cts.repository.AppointmentRequestDao;

@Service
public class AdminService {

	@Autowired
	private AdminValidationDao adminValidationDao;
	@Autowired
	private AppointmentRequestDao appoint;

	public AdminValidationDao getAdminValidationDao() {
		return adminValidationDao;
	}

	public void setAdminValidationDao(AdminValidationDao adminValidationDao) {
		this.adminValidationDao = adminValidationDao;
	}
	
	public boolean adminCredentialsValidation(String username, String password){
		System.out.println(username);
		return (adminValidationDao.adminCredentialsValidation(username, password));
	}
	public boolean AppointmentRequestValidation(String doctorName){
		System.out.println(doctorName);
		return (appoint.AppointmentRequest(doctorName));
	}
	public List<ClinicSearch> getPatientDetails(String doctorName){
		//System.out.println(doctorName);
		return (appoint.AppointmentRequest1(doctorName));
	}
	public List<PatientDetails> getPatient(String patientId){
		//System.out.println(doctorName);
		return (appoint.PatientDetails(patientId));
	}
	public int getApprove(String patientId){
		//System.out.println(doctorName);
		return (appoint.PatientApprove(patientId));
	}
}
