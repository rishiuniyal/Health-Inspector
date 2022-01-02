package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.model.DoctorCredentials;

public class DoctorRowMapper implements RowMapper<DoctorCredentials>{

	@Override
	public DoctorCredentials mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		DoctorCredentials credentials = new DoctorCredentials();
		credentials.setDoctorId(rs.getInt("doctor_Id"));
		credentials.setDoctorPassword(rs.getString("Password"));
		return credentials;
	}

}
