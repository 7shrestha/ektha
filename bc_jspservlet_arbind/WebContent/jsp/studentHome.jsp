<%@page import="com.nivtek.university.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Home</title>
<link rel="stylesheet" type="text/css"
	href="${context}/css/bootcamp.css">
<%
	Student student = (Student) session.getAttribute("student");
%>

	<!-- --------------------------------------HEADER------------------------------------------------- -->
	<table class="header_footer">
		<tr bgcolor="#CBAAEC">
			<td width="50%" class="td_center"><img
				src="picture/bootcampImage.png" style="width: 128px; height: 128px">
				<span style="color: #0000FF">EKTHA JAVA WORLD</span><br /> <i>6220
					N Beltline Rd #212 Irving, TX 75063</i></td>
			<td width="50%" align="center">Welcome::<%= student.getFirstName()%> !!! <br/><br/><a href="index.html">logout</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="jsp/studentProfile.jsp">myprofile</a></td>
		</tr>
	</table>
	<!-- --------------------------------------MENU------------------------------------------------- -->
	<jsp:include page="/html/menu.html" />
	<!-- --------------------------------------BODY SECTION------------------------------------------------- -->
	<section> <br /></br>
	<p align="center">
		Thank you for registering/login with Bootcamp Java University. <br /></br>
		Please enroll for interested program and respective courses.
	</p>

	<br /></br>
	<p align="center">
		<a href="jsp/enrollment.jsp">Enroll Now</a>
	</p>
	</section>
	<!-- --------------------------------------FOOTER------------------------------------------------- -->
	<jsp:include page="/html/footer.html" />

</body>
</html>