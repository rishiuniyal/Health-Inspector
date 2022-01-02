package com.cts.repository;

import java.sql.ResultSet;
import com.cts.model.PatientDetails;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cts.model.AdminCredentials;
import com.cts.model.ClinicSearch;
import com.cts.model.DoctorSearch;

@Repository
public class AppointmentRequestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	/*public boolean AppointmentRequest(String doctorName) {
		System.out.println(doctorName);
		String sql ="Select doctorFirstName from appointment where doctorFirstName=?";
		DoctorSearch credentials = jdbcTemplate.queryForObject(sql,new Object[] {doctorName}, new AppointmentRowMapper());
		if(credentials.getDoctorFirstName().equals(doctorName)){
			return true;
		}
		return false;
	}*/
	
	public boolean AppointmentRequest(String doctorName) {
		List<DoctorSearch> credentials=null;
		System.out.println(doctorName);
		String sql ="Select doctorFirstName from appointment where concat(doctorFirstName,' ',doctorLastName)=?";
		credentials=jdbcTemplate.query(sql,new Object[] {doctorName},new ResultSetExtractor<List<DoctorSearch>>(){  
			    public List<DoctorSearch> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			        List<DoctorSearch> list=new ArrayList<DoctorSearch>(); 
			        while(rs.next()){  
			        DoctorSearch d=new DoctorSearch();   
			        d.setDoctorFirstName(rs.getString("doctorFirstName"));
			        list.add(d);  
			        } 
			       // System.out.println(list);
			       for(DoctorSearch in:list) {
			   		 System.out.println(in.getDoctorFirstName()+"*");
			   		 
			   		 }
			       return list;
			        }  
			    });
		
		return (!credentials.isEmpty());
	}
	
	public List<ClinicSearch> AppointmentRequest1(String doctorName) {
		//System.out.println(doctorName);
		String sql ="Select clinic,patientid from appointment where concat(doctorFirstName, ' ' , doctorLastName)=?";	
		 return jdbcTemplate.query(sql,new Object[] {doctorName},new ResultSetExtractor<List<ClinicSearch>>(){  
			    public List<ClinicSearch> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			        List<ClinicSearch> list=new ArrayList<ClinicSearch>(); 
			        while(rs.next()){  
			        ClinicSearch d=new ClinicSearch();   
			        d.setClinicName(rs.getString("clinic"));
					d.setPatientId(rs.getString("patientid"));
			        list.add(d);  
			        }  
			       for(ClinicSearch in:list) {
			   		 System.out.println(in.getClinicName());
			   		 System.out.println(in.getPatientId());
			   		 }
			        //System.out.println(list);
			       
			        return list;  
			        
			        }  
			    });
		}
	
	public List<PatientDetails> PatientDetails(String patientId) {
		//System.out.println(doctorName);
		//String sql ="select p.patient_Id,p.first_name ,p.Gender,a.doctorFirstName ,u.Speciality,u.Availability from patient p join appointment a on p.patient_Id=a.patientid join updatedoctor u on a.clinic=u.Addclinic where patientid=?";
		String sql ="select p.patient_Id,p.first_name ,p.Gender,a.doctorFirstName from patient p join appointment a on p.patient_Id=a.patientid where patientid=?";
		 return jdbcTemplate.query(sql,new Object[] {patientId},new ResultSetExtractor<List<PatientDetails>>(){  
			    public List<PatientDetails> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			        List<PatientDetails> list=new ArrayList<PatientDetails>(); 
			        while(rs.next()){  
			        PatientDetails d=new PatientDetails();   
			        d.setPatientId(rs.getString("patient_Id"));
					d.setPatientName(rs.getString("first_name"));
					d.setPatientGender(rs.getString("Gender"));
					d.setDoctorName(rs.getString("doctorFirstName"));
					//d.setSpeciality(rs.getString("Speciality"));
					//d.setAvailability(rs.getString("Availability"));
			        list.add(d); 
			        
			        }  
			        
			       System.out.println(list.toString());
			       for(PatientDetails in:list) {
			   		 //System.out.println(in.getAvailability());
			   		 //System.out.println(in.getSpeciality());
			   		 }
			        //System.out.println(list);
			       
			        return list;  
			        
			        }  
			    });
		}
	
	public int PatientApprove(String patientId) {
		String sql = "update appointment set approve='Approved' where patientid=?";
		int row = jdbcTemplate.update(sql, new Object[] {patientId});
		return row;
	}
	
	public List<ClinicSearch> getAppointmentStatus(int patientId) {
		 String sql ="select doctorFirstName,clinic,approve from appointment where patientid=? and approve='Approved'";
		 return jdbcTemplate.query(sql,new Object[] {patientId},new ResultSetExtractor<List<ClinicSearch>>(){  
		    public List<ClinicSearch> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		        List<ClinicSearch> list=new ArrayList<ClinicSearch>();  
		        while(rs.next()){    
		        ClinicSearch c = new ClinicSearch();
		        c.setDoctorFirstName(rs.getString("doctorFirstName")); 
		        c.setClinicName(rs.getString("clinic"));
		        c.setApprove(rs.getString("approve"));
		        list.add(c);
		        }  
		        for(ClinicSearch search:list) {
		        	System.out.println(search.getApprove());		        }
		        return list;  
		        }  
		    });
	}
		
	}

