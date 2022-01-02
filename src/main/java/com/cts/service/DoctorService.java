package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.repository.DoctorValidationDao;

@Service
public class DoctorService {

	@Autowired
	private DoctorValidationDao doctorValidationDao;

	public DoctorValidationDao getDoctorValidationDao() {
		return doctorValidationDao;
	}

	public void setDoctorValidationDao(DoctorValidationDao doctorValidationDao) {
		this.doctorValidationDao = doctorValidationDao;
	}
	public boolean doctorCredentialValidation(int username,String password){
		
		return (doctorValidationDao.doctorCredentialsValidation(username, password));
	}
	
}
