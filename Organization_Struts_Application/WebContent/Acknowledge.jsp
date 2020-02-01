<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee><h1><i>Congratulations</i> <font color="blue"><%=request.getAttribute("newusername") %></font> you have been successfully registered</h1></marquee>
	
	<br>
		<h3>your employee id is <font color="green"><%=request.getAttribute("empid") %></font></h3>
		<br><a href="Home.jsp">Back</a>
</body>
</html>