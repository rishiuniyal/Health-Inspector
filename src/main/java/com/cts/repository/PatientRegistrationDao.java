package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRegistrationDao {
	@Autowired 
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int patientRegistration(String first_name,String last_name,String Dob, String Gender,String Contact,String patient_Id,String Password,String email,String user_category){
		String sql = "insert into patient(first_name,last_name,Dob,Gender,Contact,patient_Id,Password,email,user_category) values(?,?,?,?,?,?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {first_name,last_name,Dob,Gender,Contact,patient_Id,Password,email,user_category});
		return row;
	}
	
	public List<Integer> PatientId(){  
		 String sql ="select patient_Id from patient order by patient_Id desc limit 1";
		 return jdbcTemplate.query(sql, new RowMapper<Integer>() {
			 public Integer mapRow(ResultSet rs,int rownumber) throws SQLException{
				 
				return rs.getInt("patient_Id");
				 
			 }
		 });
		 
	}
}
