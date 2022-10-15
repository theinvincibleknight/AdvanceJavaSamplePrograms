/* JSP Program to implement verification of a particular user login and display a message*/

validation.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN FORM</title>
</head>
<body bgcolor="pink">
<form action="validation.jsp" method="get">
	<center>
	    <label><h3> Login </h3></label> <br/><hr/><br/>
	 	<label> Username <input type="text" name="user"></label><br/><br/>
	 	<label> Password <input type="password" name="pwd"></label><br/><br/>
	 	<input type="submit" value="login">
	</center>
</form>
</body>
</html>

validation.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body bgcolor="pink">
<%
    String s1=request.getParameter("user");
	String s2= request.getParameter("pwd");
	if(s1.equals("kle") && s2.equals("bca"))
		out.println("<br><h2>Valid User</h2>");
	else
		out.println("<br><h2>Invalid User</h2>");

 
  %></body></html>
