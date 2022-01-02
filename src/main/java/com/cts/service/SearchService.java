package com.cts.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.ClinicSearch;
import com.cts.model.DoctorSearch;
import com.cts.repository.ClinicSearchDao;
import com.cts.repository.SearchDoctorAppo;
import com.cts.repository.SearchDoctorDao;
@Service
public class SearchService {
	
	@Autowired
	SearchDoctorDao sd;
	
	@Autowired
	ClinicSearchDao cs;
	
	@Autowired
	SearchDoctorAppo searchdoctor;
	
	public List<DoctorSearch> displayDoctorId(String speciality)
	{
		//System.out.println(speciality);
		List<DoctorSearch> list = sd.getDisplayDoctor(speciality);
		return list;
	}
	
	public List<ClinicSearch> displayClinic(String locality)
	{
		//System.out.println(locality);
		List<ClinicSearch> list = cs.getClinic(locality);
		return list;
	}
	public List<DoctorSearch> displayDoctorAppo(String addclinic)
	{
		//System.out.println(locality);
		List<DoctorSearch> list = searchdoctor.getAppo(addclinic);
		return list;
	}
	
	public int getAppointment(String addclinic,String doctorFirstName,String doctorLastName,String patientid) {
		return (sd.getDoctorAppointment(addclinic,doctorFirstName,doctorLastName,patientid));
	}
	}

