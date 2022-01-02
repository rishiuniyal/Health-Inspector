package com.cts.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.model.DoctorCredentials;
import com.cts.service.DoctorRegistrationService;
import com.cts.service.PatientRegistrationService;

@Controller
public class RegisterController {

	@Autowired
	private PatientRegistrationService patientRegistrationService;
	
	@Autowired
	private DoctorRegistrationService doctorRegistrationService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerPageDirector(){
		return "userregistration";
	}
	@RequestMapping(value="/UserRegister1",method=RequestMethod.POST)
	public String userRegistration(@RequestParam String first_name,String last_name,String Dob, String Gender,String Contact,String patient_Id,String Password,String email,String user_category,ModelMap model){
		
		int nos = 0;
		if(user_category.equals("doctor")){
			nos = doctorRegistrationService.doctorRegistrationDetails(first_name,last_name,Dob,Gender,Contact,patient_Id,Password,email,user_category);
			if(nos>0){
				List<Integer> num = doctorRegistrationService.getDoctorId();
				System.out.println(num);
				model.addAttribute("num",num);
				return "userregistrationsuccess";
			}
		}
		else if(user_category.equals("patient")){
			nos = patientRegistrationService.PatientRegistrationDetails(first_name,last_name,Dob,Gender,Contact,patient_Id,Password,email,user_category);
			List<Integer> num = patientRegistrationService.getPatientId();
			System.out.println(num);
			model.addAttribute("num",num);
			return "userregistrationsuccess";
		}
		return "Registration Failed";
		
	}
}
