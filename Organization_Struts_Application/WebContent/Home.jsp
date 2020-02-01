<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="bean1" prefix="bean" %>
<%@ taglib uri="demo1" prefix="html" %>
<%@ taglib uri="logic1" prefix="logic" %>
<%@ page import="com.vinod.ganore.bean.UserForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/Project_CSS.css"/>
<script type="text/javascript">
function validate()
{	
	var username=document.getElementById('username').value;
	var password=document.getElementById('password').value;
	//alert("WELCOME TO ONCLICK PAGE"+username+"  "+password);
	if (username==null || username=='') 
	{
		alert("Username is Null , please enter Username ");
	}
	else if (password==null || password=='') 
	{
		alert("Password is Null , please enter Password ");
	}
	else
	{
		//alert("WELCOME TO Success page");
	}
	// document.forms[0].action = "newUserInformDetails.do?parameter=showNavigation";
     //document.forms[0].submit();
	//var newWin = window.open("Success.jsp", 'VINOD');
}
function resetDet()
{
	document.getElementById('username').value=null;
	document.getElementById('password').value=null;
}
function submitForm()
{
	var frm=document.getElementsByName('loginform')[0];
	frm.submit();
	frm.reset();
	return true;
}
	

</script>

</head>
<body><!--  onload="charger()" -->
<center>
	<h4> Friends Forever </h4>
	<fieldset style="width: 358px; ">
	<html:form  action="Login"  ><%--  name="loginform" id="loginform">   --%>
	
	<label>Username</label> 	<input type="text"  name="username" id="username" required/><br/>													<%--name="UserForm" <html:text property="username"/>	--%>											<%--bean:write name="/com.vinod.ganore.bean.UserForm" --%>
	<label>Password</label>	<input type="password"  name="password" id="password" required/>	<br>
	
													<%--	<html:text property="password"/> --%>
		<a href="NewUserLogin.jsp">New User Registration</a><br/><br/>
		    <html:submit value='submit' onclick='validate()'></html:submit>
			<html:reset value='Reset' onclick="resetDet()"></html:reset>
			</fieldset>
	</html:form>
	</center>
</body>
</html><%--name="com.vinod.ganore.bean.UserForm"--%>