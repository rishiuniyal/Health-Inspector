package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cts.model.DoctorCredentials;
import com.cts.model.DoctorInformation;
import com.cts.model.DoctorSearch;

@Repository
public class SearchDoctorDao {

		@Autowired
		private JdbcTemplate jdbcTemplate;

		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		

	

	public List<DoctorSearch> getDisplayDoctor(String speciality) {
		 String sql ="select d.first_name,d.last_name from doctor d join updatedoctor u on u.doctor_id=d.doctor_id where Speciality=?";
		 
		
		 return jdbcTemplate.query(sql, new Object[] {speciality}, new ResultSetExtractor<List<DoctorSearch>>(){  
			    public List<DoctorSearch> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			        System.out.println(speciality);
			        List<DoctorSearch> list=new ArrayList<DoctorSearch>();  
			        System.out.println(list);
			        while(rs.next()){  
			        DoctorSearch d=new DoctorSearch();   
					d.setDoctorFirstName(rs.getString(1));
			        d.setDoctorLastName(rs.getString(2));
			        list.add(d);  
			        }  
			       
			        return list;  
			        
			        }  
			    });
		
	}
	public int getDoctorAppointment(String addclinic,String doctorFirstName,String doctorLastName,String patientid){
		String sql = "insert into appointment(clinic,doctorFirstName,doctorLastName,patientid) values(?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {addclinic,doctorFirstName,doctorLastName,patientid});
		return row;
	}
}



