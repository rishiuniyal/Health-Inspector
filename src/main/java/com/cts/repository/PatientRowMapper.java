package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.model.PatientCredentials;

public class PatientRowMapper implements RowMapper<PatientCredentials>{

	@Override
	public PatientCredentials mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		PatientCredentials credentials = new PatientCredentials();
		credentials.setPatientId(rs.getInt("patient_Id"));
		credentials.setPatientPassword(rs.getString("Password"));
		return credentials;
	}

}
