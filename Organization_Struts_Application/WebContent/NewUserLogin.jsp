<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="demo1" prefix="html" %>
 <%@taglib uri="bean1" prefix="bean" %>
 <%@taglib uri="logic1" prefix="logic" %>
 <%@ page import="com.vinod.ganore.bean.NewUserForm" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script language="javascript" type="text/javascript" src="JS/datetimepicker.js">
</script>
<script src="jQuery.ui.datepicker.js">
$(function() {
    $( "#datepicker" ).datepicker();
});
</script>
<title>Insert title here</title>
</head>
<body>

	<center>
	
			<h1>New User Registration</h1>
			
			<html:form action="NewUserLogin">
			<table border='1'>
				<tr>
					
							<td>First Name</td><td><html:text  property="fisrt_name"/></td>
							<td>Middle Name</td><td><html:text  property="middle_name"/></td>							
						
				</tr>
				<tr>
					<td>Last Name</td><td><html:text  property="last_name"/></td>
					<td>Father Name</td><td><html:text  property="fname"/></td>				
				</tr>
				<tr>
					<td>DOB</td><td><html:text property="dob" />
						<a href="javascript:NewCal('dob','ddmmmyyyy')">
	  						<html:img src="Images/cal.gif" width="16" height="16" border="0" alt="Pick a date" />	  				
	  					</a>
	  				</td>			
	  	
					<td>Education</td><td><html:select property="education">
												<html:option value="">-----select-----</html:option>
												<html:option value="MCA">MCA</html:option>
												<html:option value="M.Tech">M.Tech</html:option>
												<html:option value="B.Tech">B.Tech</html:option>
												<html:option value="BSc">BSc</html:option>
												<html:option value="BA">BA</html:option>
											</html:select></td>
				</tr>
				
				<tr>
					<td>DOJ</td><td><html:text  property="doj" />
					<a href="javascript:NewCal('doj','ddmmmyyyy')">
	  						<html:img src="Images/cal.gif" width="16" height="16" border="0" alt="Pick a date" />	  				
	  					</a>
					</td>
					<td>Technology</td><td><html:select property="technology">
												<html:option value="">---select---</html:option>
												<html:option value="Java">Java</html:option>
												<html:option value="Net.">.Net</html:option>
												<html:option value="Clouds">Cloud Comp.</html:option>
												<html:option value="Unix">Unix</html:option>
												<html:option value="Android">Android</html:option>
												<html:option value="Hadoop">Hadoop</html:option>
												<html:option value="BigData">BigData</html:option>
											</html:select></td>
				</tr>
				
				
				<tr>
					<td>E-Mail</td><td><html:text  property="email"/></td>
				</tr>
		
		
		
				<tr>
					<td colspan="4" align="center">				<html:submit/><html:reset/></td>
				</tr>
				</table>
			</html:form>
			
	</center>
</body>
</html>