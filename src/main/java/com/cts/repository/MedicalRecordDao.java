package com.cts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cts.model.MedicalRecords;
import com.cts.model.PatientDetails;

@Repository
public class MedicalRecordDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int updateMedicalRecord(String patientId,String symptoms,String diagnosis,String treatmentplanned,String prescription,String revisitRequired,String nextRevisitDate,String frequencyRevisit,String doctorid){
		String sql = "insert into medicalrecord(patient_id,symptoms,diagnosis,treatmentplanned,prescription,revisitRequired,nextRevisitDate,frequencyRevisit,doctor_id) values(?,?,?,?,?,?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {patientId,symptoms,diagnosis,treatmentplanned,prescription,revisitRequired,nextRevisitDate,frequencyRevisit,doctorid});
		return row;
	}
	
	public List<MedicalRecords> displayMedicalRecords(String doctorId) {
		String sql ="select symptoms,diagnosis,treatmentplanned,prescription,revisitRequired,nextRevisitDate,frequencyRevisit from medicalrecord where doctor_id=?";	
		 return jdbcTemplate.query(sql,new Object[] {doctorId},new ResultSetExtractor<List<MedicalRecords>>(){  
			    public List<MedicalRecords> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			        List<MedicalRecords> list=new ArrayList<MedicalRecords>(); 
			        while(rs.next()){  
			        MedicalRecords d=new MedicalRecords();   
			        d.setSymptoms(rs.getString("symptoms"));
					d.setDiagnosis(rs.getString("diagnosis"));
					d.setTreatmentPlanned(rs.getString("treatmentplanned"));
					d.setPrescription(rs.getString("prescription"));
					d.setRevisitRequired(rs.getString("revisitRequired"));
					d.setNextRevisitDate(rs.getString("nextRevisitDate"));
					d.setFrequencyRevisit(rs.getString("frequencyRevisit"));
			        list.add(d);  
			        }  
			        return list;  
			        
			        }  
			    });
}
}
