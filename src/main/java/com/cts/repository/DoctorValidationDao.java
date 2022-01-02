package com.cts.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.model.DoctorCredentials;
@Repository
public class DoctorValidationDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean doctorCredentialsValidation(int userid,String password){
		String sql = "select doctor_Id,Password from doctor where doctor_Id=?";
		DoctorCredentials credentials = jdbcTemplate.queryForObject(sql, new Object[] {userid}, new DoctorRowMapper());
		if(credentials!=null){
			if(credentials.getDoctorId()==userid&&credentials.getDoctorPassword().equals(password))
				return true;
		}
		return false;
	}
}
