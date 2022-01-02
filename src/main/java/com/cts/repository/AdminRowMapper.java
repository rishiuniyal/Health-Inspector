package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.model.AdminCredentials;

public class AdminRowMapper implements RowMapper<AdminCredentials>{

	@Override
	public AdminCredentials mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		AdminCredentials credentials = new AdminCredentials();
		credentials.setAdminId(arg0.getString("admin_Id"));
		credentials.setAdminPassword(arg0.getString("Password"));
		
		return credentials;
	}
	

}
