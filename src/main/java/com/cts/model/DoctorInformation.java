package com.cts.model;

import org.springframework.web.bind.annotation.ModelAttribute;

public class DoctorInformation {
	private String doctorFirstName;
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
	public String getDoctorDob() {
		return doctorDob;
	}
	public void setDoctorDob(String doctorDob) {
		this.doctorDob = doctorDob;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorContact() {
		return doctorContact;
	}
	public void setDoctorContact(String doctorContact) {
		this.doctorContact = doctorContact;
	}
	public String getDoctorPassword() {
		return doctorPassword;
	}
	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}
	public String getDoctorId() {
		return doctorId;
	}
	@ModelAttribute("userid")
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDoctorCategory() {
		return doctorCategory;
	}
	public void setDoctorCategory(String doctorCategory) {
		this.doctorCategory = doctorCategory;
	}
	private String doctorLastName;
	private String doctorDob;
	private String doctorGender;
	private String doctorContact;
	private String doctorPassword;
	private String doctorId;
	private String doctorEmail;
	private String doctorCategory;
}
