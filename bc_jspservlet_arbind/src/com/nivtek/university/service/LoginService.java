package com.nivtek.university.service;

import com.nivtek.university.dao.LoginDAO;
import com.nivtek.university.entity.Student;

/**
 * 
 * @author Arbind Shrestha
 * @date Dec 24, 2014
 */
public class LoginService {

	/**
	 * @param student
	 * @return boolean
	 */
	public boolean validateUser(Student student) {

		LoginDAO logDAO = new LoginDAO();
		return logDAO.validateUser(student);

	}

}
