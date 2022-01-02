package com.cts.model;

public class PatientDetails {
	 private String patientId;
	 private String patientName;
	 private String patientGender;
	 private String doctorName;
	/*public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	//private String speciality;
	 //private String availability;
	  */
	public String getPatientId() {
		return patientId;
	}
	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", patientName=" + patientName + ", patientGender="
				+ patientGender + ", doctorName=" + doctorName + "]";
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
}
