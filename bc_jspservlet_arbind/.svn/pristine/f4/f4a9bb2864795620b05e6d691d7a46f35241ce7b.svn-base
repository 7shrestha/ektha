/* 
 * Copyright (c) 2014, All rights reserved.
 */
package com.nivtek.university.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nivtek.university.entity.Address;
import com.nivtek.university.entity.Student;
import com.nivtek.university.service.RegisterService;

/**
 * 
 * The RegisterController class is responsible for registration of user.
 * 
 * @author Arbind Shrestha
 * @date Dec 24, 2014
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
	}

	/**
	 * doPost method
	 * 
	 * @args request, response
	 * @throws ServletException, IOException
	 * @return void
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fName = request.getParameter("firstname");
		String lName = request.getParameter("lastname");
		String mi = request.getParameter("mi");
		String cNo = request.getParameter("contactno");
		String email = request.getParameter("email");
		String gender = request.getParameter("sex");
		String addOne = request.getParameter("addressone");
		String addTwo = request.getParameter("addresstwo");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		Student student = new Student();
		student.setFirstName(fName);
		student.setLastName(lName);
		student.setMiddleInitial(mi);
		student.setContactNo(cNo);
		student.setEmail(email);
		if (gender.equals("male")) {
			student.setGender("male");
		} else {
			student.setGender("female");
		}
		student.setUserId(uname);
		student.setPassword(pass);

		Address add = new Address();
		add.setAddressOne(addOne);
		add.setAddressTwo(addTwo);
		add.setCity(city);
		add.setState(state);
		add.setZip(zip);

		student.setAddress(add);

		RegisterService registerService = new RegisterService();
		if (registerService.registerStudent(student)) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("student", student);
				out.print("Registration is Succesful!!");
				RequestDispatcher rd = request
						.getRequestDispatcher("/jsp/studentHome.jsp");
				rd.forward(request, response);
		} else {
			out.print("Fail to Registration");
			RequestDispatcher rd = request
					.getRequestDispatcher("/jsp/studentHome.jsp");
			rd.forward(request, response);
		}
	}
//		RegisterService registerService = new RegisterService();
//		if (registerService.registerStudent(student)) {
//			HttpSession httpSession = request.getSession();
//			httpSession.setAttribute("student", student);
//			if (registerService.registerStudentAddress(student)) {
//				out.print("Registration is Succesful!!");
//				RequestDispatcher rd = request
//						.getRequestDispatcher("/jsp/studentHome.jsp");
//				rd.forward(request, response);
//			} else {
//				out.print("Only Student information is added");
//				RequestDispatcher rd = request
//						.getRequestDispatcher("/jsp/studentHome.jsp");
//				rd.forward(request, response);
//			}
//		} else {
//			out.print("Fail to Registration");
//			RequestDispatcher rd = request
//					.getRequestDispatcher("/jsp/register.jsp");
//			rd.include(request, response);
//		}
//		;

//	}
}
