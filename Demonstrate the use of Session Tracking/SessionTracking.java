/* Servlet Program to demonstrate the use of Session Tracking*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dateservlet extends HttpServlet {
	
    public Dateservlet() {
        super();
    }

	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 {
		
HttpSession hs=request.getSession(true);
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
Date created=new Date(hs.getCreationTime());
Date accessed=new Date(hs.getLastAccessedTime());
pw.print("<html><body bgcolor=pink><center><h1> Session Information<hr/></h1>");
pw.print("Session Created    :  "  +created);
pw.print("<br>Session Last Accessed    :  "  +accessed);
		
  }

}
