/* Copyright (c) 2014, All rights reserved.*/

package com.nivtek.university.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nivtek.university.entity.Cource;
import com.nivtek.university.entity.Student;
import com.nivtek.university.service.CourceService;
import com.nivtek.university.service.LoginService;

/**
 * The LoginController class is used to validate user.
 * 
 * @author Arbind Shrestha
 * @date Dec 24, 2014
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	/**
	 * method used to send request and response
	 * 
	 * @param HttpServletRequest
	 *            , HttpServletResponse
	 * @throws ServletException
	 *             , IOException
	 * 
	 * @return void
	 */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String user = request.getParameter("username");
		String pass = request.getParameter("password");

		Student student = new Student();
		student.setUserId(user);
		student.setPassword(pass);
		LoginService logService = new LoginService();

		if (logService.validateUser(student)) {
			HttpSession session = request.getSession();
			session.setAttribute("student", student);
			CourceService courceService = new CourceService();
			List<Cource> myList = new ArrayList<>();
			myList = courceService.getEnrolledCource(student);
			session.setAttribute("courceEnroll", myList);
			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/studentHome.jsp");
			rd.forward(request, response);

		} else {
			out.print("Incorrect Username or Password!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);

		}

		out.close();
	}

}