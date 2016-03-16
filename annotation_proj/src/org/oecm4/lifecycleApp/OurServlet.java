package org.oecm4.lifecycleApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns="/os",loadOnStartup=2)
public class OurServlet extends GenericServlet
{
public OurServlet() {
	System.out.println("object is created");
}
@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("servlet object is intialised");
}
	
	@Override
public void service(ServletRequest req, ServletResponse resp)
		throws ServletException, IOException 
{
	String fname=req.getParameter("fn");
	String lname=req.getParameter("ln");
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor='green'>"
			+ "<h2>welcome"+fname+lname+"</h2>"
					+ "</body></html>");
	out.flush();
	out.close();
	System.out.println("service executed");
}
	@Override
		public void destroy() {
		System.out.println("close all the costly resources");
	}
}
