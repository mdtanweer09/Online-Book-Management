package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/pqr")
public class ServletProgram extends HttpServlet{
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1>Welcome to servlet.</h1>");
		
	}

}

