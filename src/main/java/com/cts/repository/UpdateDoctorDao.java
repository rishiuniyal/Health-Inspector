package com.cts.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateDoctorDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int updateDoctorDetails(String speciality,String addClinic,String availablity,String userid){
		System.out.println(userid);
		String sql = "insert into updatedoctor(Speciality,Addclinic,Availability,doctor_id) values(?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {speciality,addClinic,availablity,userid});
		return row;
	}
}
