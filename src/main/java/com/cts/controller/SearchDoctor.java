package com.cts.controller;

import java.util.List;
import com.cts.model.DoctorSearch;
import com.cts.repository.ClinicSearchDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.ClinicSearch;
import com.cts.model.DoctorInformation;
import com.cts.service.DoctorRegistrationService;
import com.cts.service.SearchService;

@Controller
@SessionAttributes({"addclinic","userid"})
public class SearchDoctor {
	
	@Autowired
	SearchService ss;
	
	@Autowired
	DoctorRegistrationService drs;
	
	@Autowired
	ClinicSearchDao cs;
	
	@RequestMapping("/search1")
	public String Search1() {
		return "feedback";
	}
	
	@RequestMapping(value="/feedbackdetails",method=RequestMethod.POST)
	public String userFeedback(@RequestParam String patientId,String doctorname,String clinicname, String feedback){

		int	nos = drs.userFeedbackDetails(patientId,doctorname,clinicname,feedback);
			
				
				return "feedback1";
			}
	
	@RequestMapping("/search")
	public String Search() {
		
		return "searchdoctor";
	}
	
	
	/*@RequestMapping(value="/search1",method=RequestMethod.POST)
	public String Search1(@RequestParam String speciality, Model m) {
		System.out.println(speciality);
		List<DoctorSearch> list = ss.displayDoctorId(speciality);
		 for(DoctorSearch in:list) {
			 System.out.println(in.getDoctorFirstName());
			 System.out.println(in.getDoctorLastName());
			 }
		System.out.println(list);
		m.addAttribute("list", list);
		return "searchdocotor";
	}*/
	
	@RequestMapping(value="/search1",method=RequestMethod.POST)
	public ModelAndView Search1(@RequestParam String speciality,String locality, String userid) {
		System.out.println(speciality);
		System.out.println(userid);
		List<DoctorSearch> list = ss.displayDoctorId(speciality);
		List<ClinicSearch> list1 = ss.displayClinic(locality);
		ModelAndView mv=new ModelAndView();
		/*for(DoctorSearch in:list) {
			 System.out.println(in.getDoctorFirstName());
			 System.out.println(in.getDoctorLastName());
			 }*/
		mv.addObject("list",list);
		mv.setViewName("searchdoctor");
		mv.addObject("list1", list1);
		
		return mv;
		
	}
	
	/*@RequestMapping(value="/search2",method=RequestMethod.POST)
	public String Clinic(@RequestParam String locality, Model m) {
		System.out.println(locality);
		List<ClinicSearch> list1 = ss.displayClinic(locality);
		/* for(DoctorSearch in:list) {
			 System.out.println(in.getDoctorFirstName());
			 System.out.println(in.getDoctorLastName());
			 }
		System.out.println(list1);
		m.addAttribute("list1", list1);
		return "searchdoctor";
	}*/
	
	@RequestMapping("/appointment")
	public String Appointment(ModelMap model) {
		List<ClinicSearch> names=cs.getClinicNames();
		for(ClinicSearch c:names)
			System.out.println(c.getClinicName());
		
		model.addAttribute("names",names);
		return "appo";
	}
	
	
	@RequestMapping(value="/appoint",method=RequestMethod.POST)
	public ModelAndView Approve(@RequestParam String addclinic,ModelMap model) {
		List<DoctorSearch> list = ss.displayDoctorAppo(addclinic);
		model.put("addclinic",addclinic);
		ModelAndView mv=new ModelAndView();
		/*for(DoctorSearch in:list) {
			 System.out.println(in.getDoctorFirstName());
			 System.out.println(in.getDoctorLastName());
			 }*/
		mv.addObject("list",list);
		mv.setViewName("appo");
		return mv;
	}
	
	 @RequestMapping(value="/appodone/{doctorFirstName}/{doctorLastName}")    
	    public String AppointmentSuccess(@PathVariable String doctorFirstName,@PathVariable String doctorLastName, Model m,ModelMap model){   
		  // System.out.println(doctorLastName);
		   String addclinic=(String)model.get("addclinic");
		   String patientid=(String)model.get("userid");
		   //System.out.println(patientid);
		   //System.out.println(addclinic);
	       
		   int no=ss.getAppointment(addclinic,doctorFirstName,doctorLastName,patientid);    
	      // m.addAttribute("employee",employee);  
	        return "apposuccess";    
	    }   
	
	
}
