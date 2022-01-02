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

import com.cts.model.ClinicSearch;
import com.cts.model.DoctorInformation;
import com.cts.model.DoctorSearch;

@Repository
public class ClinicSearchDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

public List<ClinicSearch> getClinicNames(){
		 return jdbcTemplate.query("select * from clinic",new RowMapper<ClinicSearch>(){  
		    @Override  
		    public ClinicSearch mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        ClinicSearch name=new ClinicSearch();  
		        name.setClinicName(rs.getString(1));  
		        return name;  
		    }  
		    }); 
}  


public List<ClinicSearch> getClinic(String locality) {
	 String sql ="select clinicname from clinic where locality=?";
	 return jdbcTemplate.query(sql, new Object[] {locality}, new ResultSetExtractor<List<ClinicSearch>>(){  
		    public List<ClinicSearch> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		        System.out.println(locality);
		        List<ClinicSearch> list=new ArrayList<ClinicSearch>();  
		        System.out.println(list);
		        while(rs.next()){  
		        ClinicSearch d=new ClinicSearch();   
				d.setClinicName(rs.getString(1));
		        list.add(d);  
		        }  
		        for(ClinicSearch in:list) {
		   		 System.out.println(in.getClinicName());
		   		 
		   		 }
		        System.out.println(list);
		       
		        return list;  
		        
		        }  
		    });
	
}


	}
	

