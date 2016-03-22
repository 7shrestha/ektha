package com.nivtek.university.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.jdbc.ResultSet;
import com.nivtek.university.entity.Address;
import com.nivtek.university.entity.Student;
import com.nivtek.university.util.MysqlCon;

/**
 * 
 * @author Arbind Shrestha
 * @date Dec 22, 2014
 */
public class LoginDAO {

	/**
	 * This method is used to validate user
	 * 
	 * @param student
	 * @return boolean
	 */
	public boolean validateUser(Student student) {
		boolean condition = false;
		try {
			Connection conn=MysqlCon.connectDb();
			PreparedStatement ps = conn.prepareStatement("select * from student join address on student.add_id=address.add_id where userId=? and password=?");
			ps.setString(1, student.getUserId());
			ps.setString(2, student.getPassword());
			ResultSet rs = (ResultSet) ps.executeQuery();
			condition = rs.next();
			student.setId(rs.getInt("studentId"));
			student.setFirstName(rs.getString("firstName"));
			student.setLastName(rs.getString("lastName"));
			student.setMiddleInitial(rs.getString("middleInitial"));
			student.setContactNo(rs.getString("contactNo"));
			student.setEmail(rs.getString("email"));
			student.setGender(rs.getString("gender"));
			Address add = new Address();
			add.setAddressOne(rs.getString("addressone"));
			add.setAddressTwo(rs.getString("addresstwo"));
			add.setCity(rs.getString("city"));
			add.setState(rs.getString("state"));
			add.setZip(rs.getString("zip"));
			student.setAddress(add);
		} catch (Exception e) {
			System.out.println(e);
		}
		return condition;
	}

}
