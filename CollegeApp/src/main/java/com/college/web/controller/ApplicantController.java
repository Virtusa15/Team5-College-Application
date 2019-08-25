package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.model.Applicant;
import com.college.web.service.ApplicantServices;

/**
 * Servlet implementation class ApplicantController
 */
public class ApplicantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicantController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("text/html;charset=UTF-8");
		  
		  PrintWriter out=response.getWriter();
		  String first_name=request.getParameter("First_Name");
		  String last_name=request.getParameter("Last_Name");
		 String Dob=request.getParameter("bday");
		  String email_id=request.getParameter("Email_Id");
		  long Mobile=Long.parseLong(request.getParameter("Mobile_Number"));
		  String Gender=request.getParameter("Gender");
		  String Address=request.getParameter("Address");
		  String City=request.getParameter("City");
		  long pincode=Long.parseLong(request.getParameter("Pin_Code"));
		  String State=request.getParameter("State");
		  String Country=request.getParameter("Country");
		  String Percentage=request.getParameter("percentage");
		  String Course=request.getParameter("Course");
		  String Stream=request.getParameter("Stream");
		  Applicant app=new Applicant(first_name, last_name, Dob, email_id, Mobile, Gender, Address, City, pincode, State, Country, Percentage, Course, Stream);
	
		  try
		  {
			  ApplicantServices applicantser=new ApplicantServices();
			  boolean result=applicantser.appregister(app);
			  out.println("<html>");
		         out.println("<head>");      
		         out.println("<title>Application Submited Successfully</title>");    
		         out.println("</head>");
		         out.println("<body>");
		         out.println("<center>");
		         if(result){
		             out.println("<h1>Application Submitted Sucessfully :</h1>");
		             out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
		         }else{
		             out.println("<h1>Registration Failed</h1>");
		             out.println("<h1>application already exist </h1>");
		             out.println("To try again<a href=reg.html>Click here</a>");
		         }
		         out.println("</center>");
		         out.println("</body>");
		         out.println("</html>");
		     } finally {       
		         out.close();
			  
			  
		  }
		
	}
	

}
