package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.ClinicCredentials;

@Repository
public class ClinicRegistrationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int clinicRegistration(String ClinicName,String AddressLine1,String AddressLine2, String city,String state,String Zipcode,String[] facility1,String contactNumber,String website,String pincode,String clinicID, int userid){
		
		String facilities="";
		for(int i=0;i<facility1.length;i++) {
			System.out.println(facility1[i]);
			facilities=facilities+facility1[i]+" ";
		}
		
		System.out.println(userid);
		String sql = "insert into clinic(clinicname,addressline1,addressline2,city,state,zipcode,facilities,contactnumber,website,locality,clinicid,doctor_id) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {ClinicName,AddressLine1,AddressLine2, city,state,Zipcode,facilities,contactNumber,website,pincode,clinicID,userid});
		return row;
	}
	/*public List<String> getClinicNames(){
	
				
		 String sql ="select clinicname from clinic";
		 return jdbcTemplate.query(sql, new RowMapper<String>() {
			 public String mapRow(ResultSet rs,int rownumber) throws SQLException{
				 
				return rs.getString("clinicname");
				 
			 }
		 });
		 
	} */
}
