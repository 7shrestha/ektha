<%@page import="com.nivtek.university.entity.Cource"%>
<%@page import="com.nivtek.university.entity.Student"%>
<%@page import="java.util.*"%>
<%@page import="com.nivtek.university.service.CourceService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>enroll cource</title>
<script>
	
</script>
</head>
<body>
	<%
		Student stud = (Student) session.getAttribute("student");
		Map<String,String[]> courceOption = request.getParameterMap();
		Set<String> courceId = courceOption.keySet();
		courceId.remove("_");
		CourceService courceEnroll = new CourceService();
		for(String id: courceId){
		Cource cource =new Cource();
		cource.setId(Integer.parseInt(id.trim()));
		courceEnroll.enrollCource(stud, cource);
		}
	%>
	<%-- <%=courceId %> --%>
	
</body>
</html>