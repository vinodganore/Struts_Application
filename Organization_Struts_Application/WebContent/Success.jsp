<%@ page import="java.util.ArrayList" %>
<html>
<head>
<title>User Info...</title>
<script type='javascript' >
function func1() {
  alert("This is the first.");
}
function func2() {
  alert("This is the second.");
}

function addLoadEvent(func) {
  var oldonload = window.onload;
  if (typeof window.onload != 'function') {
    window.onload = func;
  } else {
    window.onload = function() {
      if (oldonload) {
        oldonload();
      }
      func();
    }
  }
}
addLoadEvent(func1);
addLoadEvent(func2);
addLoadEvent(function() {
    document.body.style.backgroundColor = '#EFDF95';
})

</script>
</head>
<body>
<H1 align="center"> User Inofrmation is </H1>
<%ArrayList al=(ArrayList)request.getAttribute("USER_INFORMATION");
System.out.println("In JSP Arraylist is ....."+al);
%>
<br>
<form name="f1" action="/UserInfor">
<table align="center" border='1'>
<tr><td>Name</td><td>:<%=al.get(1) %>  </td><td>Father name</td><td>:<%=al.get(2) %></td></tr>
<tr><td>Qualification</td><td>:<%=al.get(3) %>  </td><td>Email Id</td><td>:<%=al.get(4) %></td></tr>
<tr><td>Technology</td><td>: <%=al.get(5) %> </td><td>DOJ</td><td>:<%=al.get(6) %></td></tr>
</table>

</form>
<!-- <input type="button" name ="Back" value='Back'></button>   -->
<a href="Home.jsp">Back</a>
</body>
</html>