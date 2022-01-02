package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.ClinicSearch;
import com.cts.model.DoctorSearch;
import com.cts.model.PatientDetails;
import com.cts.service.AdminService;
import com.cts.service.PatientService;

@Controller
@SessionAttributes("userid")
public class AppointmentRequestController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	PatientService patientService;

	/*@RequestMapping("/request")
	public String MedicalRecord(@RequestParam String doctorName,ModelMap model) {
		System.out.println(doctorName);
			if(adminService.AppointmentRequestValidation(doctorName)){
				List<ClinicSearch> list = adminService.getPatientDetails(doctorName);
				model.addAttribute("list",list);
				for(ClinicSearch search:list) {
					System.out.println(search);
				}
				return "appointmentrequest1";
			}
		return "appointmentrequest2";
	}*/
	
	@RequestMapping("/request")
	public ModelAndView MedicalRecord(@RequestParam String doctorName,ModelMap model) {
		System.out.println(doctorName);
		ModelAndView mv=new ModelAndView();
		System.out.println(adminService.AppointmentRequestValidation(doctorName));
			if(adminService.AppointmentRequestValidation(doctorName)){
				List<ClinicSearch> list = adminService.getPatientDetails(doctorName);
				mv.addObject("list",list);
				
				/*for(ClinicSearch search:list) {
					System.out.println(search);
				}*/
				mv.setViewName("appointmentrequest1");
				return mv;
			}
			mv.setViewName("appointmentrequest2");
			return mv;
	}
	
	@RequestMapping(path="/accept/{patientId}")    
    public ModelAndView AppointmentSuccess(@PathVariable String patientId, Model m,ModelMap model){   
	  System.out.println(patientId);
      List<PatientDetails> list=adminService.getPatient(patientId); 
      int approve = adminService.getApprove(patientId);
      ModelAndView mv=new ModelAndView();
      /*for(PatientDetails in:list) {
	   		 System.out.println(in.getAvailability());
	   		 System.out.println(in.getSpeciality());
	   		 }*/
     mv.addObject("list",list);
      m.addAttribute("list",list);
      mv.setViewName("patientdetails");
      return mv;    
    }  
	@RequestMapping(value="/reject")  
	public String AppointmentReject() {
		return "reject";
	}
	
	
	
}
