package com.cts.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.model.PatientCredentials;
@Repository
public class PatientValidationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean patientCredentialValidation(int username, String password){
		String sql = "select patient_Id,Password from patient where patient_Id = ?";
		PatientCredentials credentials = jdbcTemplate.queryForObject(sql,new Object[]{username}, new PatientRowMapper());
		if(credentials!=null){
			if(credentials.getPatientPassword().equals(password)&&credentials.getPatientId()==username)
				return true;
		}
		return false;
	}
}
