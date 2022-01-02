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

import com.cts.model.DoctorSearch;

@Repository
public class SearchDoctorAppo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<DoctorSearch> getAppo(String addclinic) {
		 String sql ="select d.first_name,d.last_name from doctor d join clinic u on u.doctor_id=d.doctor_id where clinicname=?";
		 
		 /*List<DoctorSearch> information=jdbcTemplate.query(sql,new Object[] {speciality}, new DoctorSearchRowMapper());
		 for(DoctorSearch in:information) {
		 System.out.println(in.getDoctorFirstName());
		 System.out.println(in.getDoctorLastName());
		 }
		 return information;*/
		 return jdbcTemplate.query(sql, new Object[] {addclinic}, new ResultSetExtractor<List<DoctorSearch>>(){  
			    public List<DoctorSearch> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			        System.out.println(addclinic);
			        List<DoctorSearch> list=new ArrayList<DoctorSearch>();  
			        //System.out.println(list);
			        while(rs.next()){  
			        DoctorSearch d=new DoctorSearch();   
					d.setDoctorFirstName(rs.getString(1));
			        d.setDoctorLastName(rs.getString(2));
			        list.add(d);  
			        }  
			     /*  for(DoctorSearch in:list) {
			   		 System.out.println(in.getDoctorFirstName());
			   		 System.out.println(in.getDoctorLastName());
			   		 }*/
			        //System.out.println(list);
			       
			        return list;  
			        
			        }  
			    });
		
	}

}