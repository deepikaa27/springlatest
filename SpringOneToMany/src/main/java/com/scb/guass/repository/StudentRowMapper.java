
package com.scb.guass.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scb.guass.model.Acc;
import com.scb.guass.model.Accounts;
import com.scb.guass.model.Groups;
import com.scb.guass.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.setCustomerId(rs.getInt(1));
		stud.setCorporateName(rs.getString(2));
		stud.setEmail(rs.getString(3));
		stud.setMobile(rs.getInt(4));
		
		return stud;
	}

}
