package com.nivtek.university.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;
import com.nivtek.university.entity.Cource;
import com.nivtek.university.entity.Student;
import com.nivtek.university.util.MysqlCon;

/**
 * 
 * @author Arbind Shrestha
 * @date Dec 24, 2014
 */
public class CourceDAO {
	/**
	 * 
	 * @param program
	 * @return List<Cource>
	 */
	public List<Cource> getCources(String program) {
		List<Cource> courceList = new ArrayList<>();

		try {
			Connection conn=MysqlCon.connectDb();
			PreparedStatement ps = conn.prepareStatement("select p_id from program where programs=?");
//			PreparedStatement ps = MysqlCon
//					.connectDb("select p_id from program where programs=?");
			ps.setString(1, program);

			ResultSet rs = (ResultSet) ps.executeQuery();
			rs.next();
			int programId = rs.getInt("p_id"); // get programID from programs //
												// name

			PreparedStatement psTwo = conn.prepareStatement("select * from cource where p_id='" + programId
//							PreparedStatement psTwo = MysqlCon
//							.connectDb("select * from cource where p_id='" + programId
							+ "'");
			ResultSet rsTwo = (ResultSet) psTwo.executeQuery();
			while (rsTwo.next()) {
				Cource cource = new Cource();
				cource.setId(rsTwo.getInt("c_id"));
				cource.setName(rsTwo.getString("cources"));
				courceList.add(cource);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return courceList;
	}

	int courceSave;

	public int saveCource(Student student, Cource cource) {
		try {
			Connection conn=MysqlCon.connectDb();
			PreparedStatement ps = conn.prepareStatement("insert into student_cource (s_id, c_id) values (?,?)");
			ps.setInt(1, student.getId());
			ps.setInt(2, cource.getId());

			courceSave = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return courceSave;

	}

	public List<Cource> getCourceEnrolled(Student student) {
		List<Cource> listCource = new ArrayList<>();

		try {
			Connection conn=MysqlCon.connectDb();
			PreparedStatement ps = conn.prepareStatement("select cources from student_cource join cource on student_cource.c_id=cource.c_id where s_id=?");
			ps.setInt(1, student.getId());

			ResultSet rsCource = (ResultSet) ps.executeQuery();

			while (rsCource.next()) {
				Cource cource = new Cource();
				cource.setName(rsCource.getString("cources"));
				listCource.add(cource);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listCource;
	}

}
