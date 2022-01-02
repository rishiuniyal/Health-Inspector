package com.cts.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.model.AdminCredentials;

@Repository
public class AdminValidationDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	public boolean adminCredentialsValidation(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		String sql ="Select * from admin";
		AdminCredentials credentials = jdbcTemplate.queryForObject(sql, new AdminRowMapper());
		if(credentials.getAdminId().equals(username)&& credentials.getAdminPassword().equals(password)){
			return true;
		}
		return false;
	}

}
