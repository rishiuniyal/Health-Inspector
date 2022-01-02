package com.cts.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.model.ClinicSearch;
import com.cts.service.AdminService;
import com.cts.service.DoctorService;
import com.cts.service.PatientService;


@Controller
@SessionAttributes("userid")
public class LoginController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private PatientService patientService;
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public DoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	
	@RequestMapping("/enter")
	public String enter() {
		return "user";
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String indexPage(){
		
		return "userlogin";
	}
	
	@RequestMapping(value="goadmindash",method=RequestMethod.GET)
	public String goAdmin(){
		return "admindashboard";
	}
	
   @RequestMapping(value="/dashboard1",method=RequestMethod.POST)
	public String goPatient(){
		return "patientdashboard";
	}
	
	@RequestMapping("/register")
    public String UserRegistration(Model m) {
		//System.out.println("user registration");
		//m.addAttribute("list","doctor");
		return "userregistration";
	}
	
	
	
	@RequestMapping(value="/dashboard", method=RequestMethod.POST)
	public String loginValidator(@RequestParam String userid,String password,String user_category,ModelMap model){
		model.put("userid",userid);
		if(user_category.equalsIgnoreCase("Admin")){
			if(adminService.adminCredentialsValidation(userid, password)){
				return "admindashboard";
			}
		}
		else if(user_category.equalsIgnoreCase("patient")){
			int patientId = Integer.parseInt(userid);
			if(patientService.patientCredentialValidation(patientId, password)){
				List<ClinicSearch> appointments = patientService.AppointmentStatus(patientId);
				model.addAttribute("appointments",appointments);
				/*for(ClinicSearch search:appointments) {
					//System.out.println(search.getApprove());
					if(search.getApprove().equals("Approved")) {*/
						
				//}
				
				return "patientdashboard";
			}
			
		}
		else if(user_category.equalsIgnoreCase("doctor")){
			int doctorId = Integer.parseInt(userid);
			//System.out.println(doctorId);
			
			if(doctorService.doctorCredentialValidation(doctorId, password)){
				return "doctordashboard";
			}
			
		}
		model.addAttribute("message","Invalid UserName or Password");
		return "userlogin";
		
	}
	
	@RequestMapping("/doctordash")
	public String doctorDashBoard() {
		return "doctordashboard";
	}
	
	
}
