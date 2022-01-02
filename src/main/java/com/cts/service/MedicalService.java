package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.MedicalRecords;
import com.cts.repository.MedicalRecordDao;

@Service
public class MedicalService {
  
	@Autowired
	MedicalRecordDao medicalRecord;

	public MedicalRecordDao getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecordDao medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	
	public int MedicalRecord(String patientId,String symptoms,String diagnosis,String treatmentplanned,String prescription,String revisitRequired,String nextRevisitDate,String frequencyRevisit,String doctorid) {
	  return (medicalRecord.updateMedicalRecord(patientId,symptoms,diagnosis,treatmentplanned,prescription,revisitRequired,nextRevisitDate,frequencyRevisit,doctorid));
	}
	
	public List<MedicalRecords> updateMedicalRecords(String doctorId){
		return (medicalRecord.displayMedicalRecords(doctorId));
	}
}
