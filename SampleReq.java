package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleReq
 */
@WebServlet("/SampleReq")
public class SampleReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String name= request.getParameter("empname");
		int sal= Integer.parseInt(request.getParameter("sal"));
		String skills[]= request.getParameterValues("skills");
		out.println("Employee name = "+ name+" <br>");
		out.println("Salary is "+sal+"<br>");
		for(String s: skills)
			out.println(s+" ");
	}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}

}
