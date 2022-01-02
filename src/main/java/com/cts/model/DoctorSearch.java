package com.cts.model;

public class DoctorSearch {
	@Override
	public String toString() {
		return "DoctorSearch [doctorFirstName=" + doctorFirstName + ", doctorLastName=" + doctorLastName + "]";
	}
	private String doctorFirstName;
	private String doctorLastName;
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
}
