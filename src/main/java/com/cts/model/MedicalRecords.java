package com.cts.model;

public class MedicalRecords {
private String symptoms;
public String getSymptoms() {
	return symptoms;
}
public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}
public String getDiagnosis() {
	return diagnosis;
}
public void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}
public String getTreatmentPlanned() {
	return treatmentPlanned;
}
public void setTreatmentPlanned(String treatmentPlanned) {
	this.treatmentPlanned = treatmentPlanned;
}
public String getPrescription() {
	return prescription;
}
public void setPrescription(String prescription) {
	this.prescription = prescription;
}
public String getRevisitRequired() {
	return revisitRequired;
}
public void setRevisitRequired(String revisitRequired) {
	this.revisitRequired = revisitRequired;
}
public String getNextRevisitDate() {
	return nextRevisitDate;
}
public void setNextRevisitDate(String nextRevisitDate) {
	this.nextRevisitDate = nextRevisitDate;
}
public String getFrequencyRevisit() {
	return frequencyRevisit;
}
public void setFrequencyRevisit(String frequencyRevisit) {
	this.frequencyRevisit = frequencyRevisit;
}
private String diagnosis;
private String treatmentPlanned;
private String prescription;
private String revisitRequired;
private String nextRevisitDate;
private String frequencyRevisit;
}
