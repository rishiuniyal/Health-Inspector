package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.DoctorCredentials;
import com.cts.model.DoctorSearch;

@Repository
public class DoctorRegistrationDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int doctorRegistration(String first_name,String last_name,String Dob, String Gender,String Contact,String doctor_Id,String Password,String email,String user_category){
		String sql = "insert into doctor(first_name,last_name,Dob,Gender,Contact,doctor_Id,Password,email,user_category) values(?,?,?,?,?,?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {first_name,last_name,Dob,Gender,Contact,doctor_Id,Password,email,user_category});
		return row;
	}
	
	
	public List<Integer> DoctorId(){  
		 String sql ="select doctor_Id from doctor order by doctor_Id desc limit 1";
		 return jdbcTemplate.query(sql, new RowMapper<Integer>() {
			 public Integer mapRow(ResultSet rs,int rownumber) throws SQLException{
				 
				return rs.getInt("doctor_Id");
				 
			 }
		 });
		 
	}
	public int userFeedback(String patientId,String doctorname,String clinicname, String feedback){
		String sql = "insert into feedback(patient_Id,doctor_name,clinic_name,feedback) values(?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {patientId,doctorname,clinicname,feedback});
		return row;
	}
		
	}


