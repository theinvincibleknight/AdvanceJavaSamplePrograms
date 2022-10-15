/* Servlet Program to change the color of the page by accepting color from user */

color.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="color" method="get">
	
	    <label><h3> Change Color</h3></label> <br/><hr/><br/>
	 	<label> Enter Color <input type="text" name="clr"></label><br/><br/>
	 	
	 	<input type="submit" value="Submit">
	
</form>
</body>
</html>

color.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class color extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public color() {
        super();
        
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	String c=request.getParameter("clr");
	pw.print("<html><body bgcolor="+c+">");
	pw.print("<br><h2> Hello  </h2><br><h3>Welcome to Home page</h3>");
	pw.print("</body></html>");
	}

}
