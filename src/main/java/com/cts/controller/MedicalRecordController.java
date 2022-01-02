package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.model.MedicalRecords;
import com.cts.service.MedicalService;

@Controller
@SessionAttributes("userid")
public class MedicalRecordController {
	
	@Autowired
	MedicalService service;
	
	@RequestMapping("/Medicalrecord")
	public String MedicalRecord() {
		return "Medicalrecord1";
	}
	@RequestMapping(value="/medical",method=RequestMethod.POST)
	public String Medical(@RequestParam String patientId,String symptoms,String diagnosis,String treatmentplanned,String prescription,String revisitRequired,String nextRevisitDate,String frequencyRevisit,ModelMap model) {
		String doctorid = (String)model.get("userid");
		service.MedicalRecord(patientId,symptoms,diagnosis,treatmentplanned,prescription,revisitRequired,nextRevisitDate,frequencyRevisit,doctorid);
		return "medicalrecordsuccess";
	}
	
	@RequestMapping("/appointmentrequest")
	public String AppointmentRequest() {
		return "appointmentrequest";
	}
	
	@RequestMapping("/appointmentrequest1")
	public String AppointmentRequest1() {
		return "appointmentrequest1";
	}
	
	@RequestMapping("/updaterecords")
	public String updateRecords(ModelMap model) {
		String doctorid = (String)model.get("userid");
		List<MedicalRecords> medicalRecords = service.updateMedicalRecords(doctorid);
		model.addAttribute("medicalRecords",medicalRecords);
		return "medicalrecordsuccess";
	}
}
