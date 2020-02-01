
<%@ taglib uri="bean1" prefix="bean" %>

<%@ taglib uri="logic1" prefix="logic" %>
<%@ page import="com.vinod.ganore.bean.UserForm" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
    String username=(String)request.getAttribute("UNAME");
    request.setAttribute("username",username);
    System.out.println("username is "+username);
    %>
<p>
   <html:link page="/UserInfor.do" paramId="username"  paramProperty="<%=username %>">
           Click me to access to User Information
   </html:link>
</p> 
Username: <%=request.getAttribute("UNAME") %>
Password: <%=request.getAttribute("PWD") %>
<%ServletContext context = request.getSession().getServletContext();

context.setAttribute("UNAME", request.getAttribute("UNAME"));
context.setAttribute("PWD", request.getAttribute("PWD")); %>
</body>
</html>