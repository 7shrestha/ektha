package com.nivtek.university.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.nivtek.university.entity.Address;
import com.nivtek.university.entity.Student;
import com.nivtek.university.util.MysqlCon;

/**
 * 
 * @author Arbind Shrestha
 * @date Dec 24, 2014
 */
public class RegisterDAO {

	public boolean registerStudent(Student student) {
		boolean condition=false;
		String sqlAdd = "insert into address (addressone,addresstwo,city,state,zip) values(?,?,?,?,?)";
		try {
			Connection con = MysqlCon.connectDb();
			PreparedStatement psAdd = con.prepareStatement(sqlAdd, Statement.RETURN_GENERATED_KEYS);
			Address address = student.getAddress();
			psAdd.setString(1, address.getAddressOne());
			psAdd.setString(2, address.getAddressTwo());
			psAdd.setString(3, address.getCity());
			psAdd.setString(4, address.getState());
			psAdd.setString(5, address.getZip());
			int addressUpdate = psAdd.executeUpdate();
			
			if(addressUpdate==1){
				condition=true;
				ResultSet rs=psAdd.getGeneratedKeys();
				rs.next();
				PreparedStatement ps=con.prepareStatement("insert into student (firstName,lastName,middleInitial,contactNo,email,gender,userId,password,add_id) values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1, student.getFirstName());
				ps.setString(2, student.getLastName());
				ps.setString(3, student.getMiddleInitial());
				ps.setString(4, student.getContactNo());
				ps.setString(5, student.getEmail());
				ps.setString(6, student.getGender());
				ps.setString(7, student.getUserId());
				ps.setString(8, student.getPassword());
				ps.setInt(9, rs.getInt(1));
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return condition;
	}



//	public int registerStudent(Student student) {
//		
//		String sql = "insert into student (firstName,lastName,middleInitial,contactNo,email,gender,userId,password) values(?,?,?,?,?,?,?,?)";
//		try {
//			PreparedStatement ps = MysqlCon.connectDb(sql);
//			ps.setString(1, student.getFirstName());
//			ps.setString(2, student.getLastName());
//			ps.setString(3, student.getMiddleInitial());
//			ps.setString(4, student.getContactNo());
//			ps.setString(5, student.getEmail());
//			ps.setString(6, student.getGender());
//			ps.setString(7, student.getUserId());
//			ps.setString(8, student.getPassword());
//			studentUpdate = ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return studentUpdate;
//	}
//	
//	public int getStudentId(Student student) throws Exception {
//		String stuId = "select studentId from student where userId='"
//				+ student.getUserId() + "' and password='"
//				+ student.getPassword() + "'";
//		PreparedStatement psAdd = MysqlCon.connectDb(stuId);
//		ResultSet rs = (ResultSet) psAdd.executeQuery();
//		rs.next();
//		int stuID = rs.getInt("studentId");
//		return stuID;
//		
//	}
//	
//	public int registerAddress(Student student) {
//		String sqlAdd = "insert into address (addressone,addresstwo,city,state,zip,studentId) values(?,?,?,?,?,?)";
//		try {
//			PreparedStatement psAdd = MysqlCon.connectDb(sqlAdd);
//			psAdd.setString(1, student.getAddress().getAddressOne());
//			psAdd.setString(2, student.getAddress().getAddressTwo());
//			psAdd.setString(3, student.getAddress().getCity());
//			psAdd.setString(4, student.getAddress().getState());
//			psAdd.setString(5, student.getAddress().getZip());
//			psAdd.setInt(6, getStudentId(student));
//			addressUpdate = psAdd.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return addressUpdate;
//	}

}
