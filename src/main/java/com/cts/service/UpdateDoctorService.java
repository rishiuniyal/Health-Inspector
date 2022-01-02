package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.repository.UpdateDoctorDao;

@Service
public class UpdateDoctorService {
	@Autowired
	private UpdateDoctorDao updateDoctorDao;

	
	public UpdateDoctorDao getUpdateDoctorDao() {
		return updateDoctorDao;
	}


	public void setUpdateDoctorDao(UpdateDoctorDao updateDoctorDao) {
		this.updateDoctorDao = updateDoctorDao;
	}


	public int UpdateDoctorRegDetails(String speciality,String addClinic,String availablity,String doctorid){
		System.out.println(doctorid);
		return (updateDoctorDao.updateDoctorDetails(speciality,addClinic,availablity,doctorid));
	}
}
