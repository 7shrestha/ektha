<%@page import="java.util.*"%>
<%@page import="com.nivtek.university.entity.Cource"%>
<%@page import="com.nivtek.university.entity.Student"%>
<%@page import="com.nivtek.university.entity.Address"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Profile</title>
<link rel="stylesheet" type="text/css"
	href="${context}/css/bootcamp.css">
</head>
<body>
	<!-- --------------------------------------HEADER------------------------------------------------- -->
	<table class="header_footer">
		<tr bgcolor="#CBAAEC">
			<td width="50%" class="td_center"><img
				src="../picture/bootcampImage.png"
				style="width: 128px; height: 128px"> <span
				style="color: #0000FF">EKTHA JAVA WORLD</span><br /> <i>6220 N
					Beltline Rd #212 Irving, TX 75063</i></td>
			<%
				Student student = (Student) session.getAttribute("student");
			%>
			<td width="50%" align="center"><%=student.getFirstName()%> !!!<br />
				<br /> <a href="../index.html">logout</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		</tr>
	</table>
	<!-- --------------------------------------MENU------------------------------------------------- -->
	<jsp:include page="/html/menu.html" />
	<!-- --------------------------------------BODY SECTION------------------------------------------------- -->
	<section> <br />
	<p align="center">
		<u style="color: red">Personnel Details:</u> <br />First Name:
		&nbsp;&nbsp;&nbsp;<%=student.getFirstName()%>
		<br />Last Name:&nbsp;&nbsp;&nbsp;<%=student.getLastName()%>
		<br />MI:&nbsp;&nbsp;&nbsp;<%=student.getMiddleInitial()%>
		<br />Contact No:&nbsp;&nbsp;&nbsp;<%=student.getContactNo()%>
		<br />Email:&nbsp;&nbsp;&nbsp;<%=student.getEmail()%>
		<br />Gender:&nbsp;&nbsp;&nbsp;<%=student.getGender()%>
	</p>
	<p align="center">
		<u style="color: red">Address Details:</u> <br />Address1:
		&nbsp;&nbsp;&nbsp;<%=student.getAddress().getAddressOne()%>
		<br />Address2:&nbsp;&nbsp;&nbsp;<%=student.getAddress().getAddressTwo()%>
		<br />City:&nbsp;&nbsp;&nbsp;<%=student.getAddress().getCity()%>
		<br />State:&nbsp;&nbsp;&nbsp;<%=student.getAddress().getState()%>
		<br />zip Code:&nbsp;&nbsp;&nbsp;<%=student.getAddress().getZip()%>
	</p>
	<p align="center">
		<u style="color: red">Enrolled Cources</u> <br />
		<%
			List<Cource> courceList = (List<Cource>) session
					.getAttribute("courceEnroll");
			for (Cource e : courceList) {
				out.print(e.getName());
		%><br />
		<%
			}
		%>
	</p>

	</section>
	<!-- --------------------------------------FOOTER------------------------------------------------- -->
	<%-- <jsp:include page="/html/footer.html" /> --%>
	<div style="width: 99%; position: fixed; bottom: 0">
		<table class="header_footer">
			<tr bgcolor="#CBAAEC" height="70px">
				<td width="50%" class="td_center"><a href="About">About</a> <br />
					<a href="jsp/enrollment.jsp">Enrollment</a></td>
				<td width="50%" class="td_center"><a href="Contact">Contact</a>
					<br /> <a href="Programs">Programs</a></td>
			</tr>
		</table>
	</div>
</body>
</html>