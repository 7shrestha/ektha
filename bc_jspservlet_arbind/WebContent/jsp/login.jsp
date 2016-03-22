<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="${context}/css/bootcamp.css">
</head>
<body>
	<!-- --------------------------------------HEADER------------------------------------------------- -->
	<jsp:include page="/html/header.html" />
	<td width="50%" align="center"><a href="login"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="register"></a></td>
	</tr>
	</table>

	<!-- ------------------------------------Menu--------------------------------------------- -->
	<jsp:include page="/html/menu.html" />

	<!-- --------------------------------------BODY SECTION------------------------------------------------- -->
	<div id="container">
		<form style="text-align: center;" action="../login" method="post">
			<br /> <br /> <br /> <br />
			<div class="line">
				<label for="username">User name: </label><input type="text"
					name="username" />
			</div>
			<br />
			<div class="line">
				<label for="password">Password: </label><input type="password"
					name="password" />
			</div>
			<br />
			<div class="line submit">
				<input type="submit" value="Go" style="width: 80px" />
			</div>
		</form>
	</div>
	<!-- --------------------------------------FOOTER------------------------------------------------- -->
	<jsp:include page="/html/footer.html" />

</body>
</html>