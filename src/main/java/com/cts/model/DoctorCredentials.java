package com.cts.model;

public class DoctorCredentials {

	private int DoctorId;
	public int getDoctorId() {
		return DoctorId;
	}
	
	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}
	public String getDoctorPassword() {
		return DoctorPassword;
	}
	public void setDoctorPassword(String doctorPassword) {
		DoctorPassword = doctorPassword;
	}
	private String DoctorPassword;
	
}
