package com.nivtek.university.service;

import java.util.List;

import com.nivtek.university.dao.CourceDAO;
import com.nivtek.university.entity.Cource;
import com.nivtek.university.entity.Student;

/**
 * 
 * @author Arbind Shrestha
 * @date Dec 24, 2014
 */
public class CourceService {

	/**
	 * @param pName
	 * @return List<Cource>
	 */
	public List<Cource> getCources(String pName) {
		CourceDAO cource = new CourceDAO();
		return cource.getCources(pName);
	}

	/**
	 * @param student
	 * @param cource
	 * @return boolean
	 */
	public boolean enrollCource(Student student, Cource cource) {
		boolean enrollStatus = false;
		CourceDAO enroll = new CourceDAO();
		if (enroll.saveCource(student, cource) > 0) {
			enrollStatus = true;
		} else {
			enrollStatus = false;
		}
		;
		return enrollStatus;
	}

	/**
	 * @param student
	 * @return List<Cource>
	 */
	public List<Cource> getEnrolledCource(Student student) {
		CourceDAO courceList = new CourceDAO();
		return courceList.getCourceEnrolled(student);
	}

}
