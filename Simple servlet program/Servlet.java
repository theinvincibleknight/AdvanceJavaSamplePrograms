/* Java Program to create a simple servlet program to display Hello world  */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hello extends HttpServlet {
	
    public hello() {
        super();
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
     response.getWriter().append("Served at: ").append(request.getContextPath());
     response.setContentType("text/html");
     PrintWriter pw=response.getWriter();
     pw.print("<html><body>");
     pw.print("<h3>Hello World </h3><br><h2><marquee>Welcome to Home page </marquee> </h2> ");
     pw.print("</body></html>");
  }

}
