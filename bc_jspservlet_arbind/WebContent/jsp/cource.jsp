<%@page import="java.util.*"%>
<%@page import="com.nivtek.university.entity.Program"%>
<%@page import="com.nivtek.university.entity.Cource"%>
<%@page import="com.nivtek.university.service.CourceService"%>
<%@page import="com.nivtek.university.dao.CourceDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cources List</title>
</head>
<body>
	<%
		String courceOption = request.getParameter("programName");

		CourceService corService = new CourceService();
		List<Cource> courceList = corService
				.getCources(courceOption);
	%>
	<%
		for (Cource cource : courceList) {
	%>

	<input type="checkbox" id="<%=cource.getId()%> "
		class="trendingCource" value="<%=cource.getName()%>">
	<%=cource.getName()%><br>
	<%
		}
	%>

</body>
</html>