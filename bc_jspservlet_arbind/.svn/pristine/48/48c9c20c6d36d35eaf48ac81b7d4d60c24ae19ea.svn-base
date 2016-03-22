<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register</title>
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
<!-- --------------------------------------MENU------------------------------------------------- -->
<table class="header_footer">
	<tr height="25" bgcolor="#7DE6BB">
		<td width="33%" align="center"><a href="../index.html">HOME</a></td>
		<td width="33%" align="center"><a href="ABOUT">ABOUT</a></td>
		<td width="33%" align="center"><a href="CONTACT">CONTACT</a></td>
	</tr>
</table>
<!-- --------------------------------------BODY SECTION------------------------------------------------- -->
<div id="container">
	<form style="text-align: center;" action="../register" method="post">
		<p>REGISTER</p>
		<p align="left">
			<u>Personnel Details:</u>
		</p>
		<div class="line">
			<label for="firstName">First Name*: </label><input type="text"
			name="firstname" />
		</div>
		<div class="line">
			<label for="lastName">Last Name*: </label><input type="text"
			name="lastname" />
		</div>
		<div class="line">
			<label for="mi">Middle Initial: </label><input type="text" name="mi" />
		</div>
		<div class="line">
			<label for="contactNo">Contact No*:</label><input type="text"
			name="contactno" />
		</div>
		<div class="line">
			<label for="email">Email*: </label><input type="email" name="email" />
		</div>
		<div class="line">
			<label for="gender">Gender*: </label>Male <input type="radio"
			name="sex" id="male" value="male" checked> Female <input
			type="radio" name="sex" id="female" value="female">
		</div>
		<p align="left">
			<u>Address Details:</u>
		</p>
		<div class="line">
			<label for="addressOne">Address Line 1: </label><input type="text"
			name="addressone" />
		</div>
		<div class="line">
			<label for="addressTwo">Address Line 2: </label><input type="text"
			name="addresstwo" />
		</div>
		<div class="line">
			<label for="city">City: </label><input type="text" name="city" />
		</div>
		<div class="line">
			<label for="state">State: </label><input type="text" name="state" />
		</div>
		<div class="line">
			<label for="zip">ZIP: </label><input type="text" name="zip" />
		</div>
		<p align="left">
			<u>User Details:</u>
		</p>
		<div class="line">
			<label for="username">User ID*: </label><input type="text"
			name="username" />
		</div>
		<div class="line">
			<label for="password">Password*: </label><input type="text"
			name="password" />
		</div>
		<div class="line submit">
			<input type="submit" value="Submit" /> &nbsp;&nbsp;&nbsp;<input
			type="reset" value="Reset" />
		</div>
	</form>
</div>
<!-- --------------------------------------FOOTER------------------------------------------------- -->
<jsp:include page="/html/footer.html" />

</body>
</html>