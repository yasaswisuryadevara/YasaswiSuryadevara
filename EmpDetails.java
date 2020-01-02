package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpDetails
 */
@WebServlet("/EmpDetails")
public class EmpDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out= response.getWriter();
		String Name= request.getParameter("Employee Name");
		String MailID= request.getParameter("MailID");
		String DateOfJoining= request.getParameter("Date Of Joining");
		String JobDesignation= request.getParameter("Job Designation");
		int salary= Integer.parseInt(request.getParameter("Salary"));
		out.println("Employee name = "+ Name+" <br>");
		out.println("MailID= "+ MailID+"<br>");
		out.println("DateOfJoining= "+ DateOfJoining+"<br>");
		out.println("JobDesignation= "+ JobDesignation+"<br>");
		out.println("Salary= "+ salary+"<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
