<%@page import="com.nivtek.university.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enrollment</title>
<link rel="stylesheet" type="text/css"
	href="${context}/css/bootcamp.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
	<jsp:include page="../js/courceCall.js" />
</script>
<script>
	<jsp:include page="../js/courceEnroll.js" />
</script>
</head>
<body>
	<!-- --------------------------------------HEADER------------------------------------------------- -->
	<jsp:include page="/html/header.html" />
	<%
		Student student = (Student) session.getAttribute("student");
	%>
	<td width="50%" align="center"><%=student.getFirstName()%><br />
		<br /> <a href="../index.html">logout</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	</tr>
	</table>
	<!-- --------------------------------------MENU------------------------------------------------- -->
	<jsp:include page="/html/menu.html" />
	<!-- --------------------------------------BODY SECTION------------------------------------------------- -->
	<div align="center">
		<h4>
			Welcome to bootcamp enrollment. <br /> Please register your
			courses!!
		</h4>

		<h4>
			<u>Enrollment</u>
		</h4>
		<p>Available Programs</p>
		<select id="cource" name="options" onchange="getCources()">
			<option value="empty">Select Program</option>
			<option value="Java">Java</option>
			<option value=".NET">.NET</option>
			<option value="SAP">SAP</option>
			<option value="mySQL">mySQL</option>
		</select>
	</div>
	<br />
	<br />

	<table width="100%">
		<tr>
			<td width="33%"></td>
			<td width="33%">Available Cources</td>
			<td width="33%"></td>
		</tr>
		<tr>
			<td width="33%"></td>
			<td width="33%" id="availableCources"></td>
			<td width="33%"></td>
		</tr>
		<tr>
			<td width="33%"></td>
			<td width="33%" class="td_center"><input type="submit"
				value="Enroll" onclick="sendCources()"></td>
			<td width="33%"></td>
		</tr>
		<tr>
			<td width="33%"></td>
			<td width="33%" id="enrolled"></td>
			<td width="33%"></td>
		</tr>

	</table>
	<!-- --------------------------------------FOOTER------------------------------------------------- -->
	<jsp:include page="/html/footer.html" />
</body>
</html>