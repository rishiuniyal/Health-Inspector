package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.DoctorCredentials;
import com.cts.repository.DoctorRegistrationDao;

@Service
public class DoctorRegistrationService {

	@Autowired
	private DoctorRegistrationDao doctorRegistrationDao;

	public DoctorRegistrationDao getDoctorRegistrationDao() {
		return doctorRegistrationDao;
	}

	public void setDoctorRegistrationDao(DoctorRegistrationDao doctorRegistrationDao) {
		this.doctorRegistrationDao = doctorRegistrationDao;
	}
	public int doctorRegistrationDetails(String first_name,String last_name,String Dob,String Gender,String Contact,String doctor_Id,String Password,String email,String user_category){
		return (doctorRegistrationDao.doctorRegistration(first_name,last_name,Dob,Gender,Contact,doctor_Id,Password,email,user_category));
	}
	public  List<Integer> getDoctorId(){
		return (doctorRegistrationDao.DoctorId());
	}
	public int userFeedbackDetails(String patientId,String doctorname,String clinicname, String feedback){
		return (doctorRegistrationDao.userFeedback(patientId,doctorname,clinicname,feedback));
	}
}
