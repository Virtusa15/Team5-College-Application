package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.college.web.model.Applicant;
import com.college.web.service.ApplicantServices;

/**
 * Servlet implementation class ApplicantViewController
 */
public class ApplicantViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicantViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		ApplicantServices applicantservices=new ApplicantServices();
	 List<Applicant> applicant=applicantservices.getAllApplicants();
	 if(applicant==null)
	 {
		 out.println("<h1>no applications found</h1>");
	 }
	 else
	 {
		HttpSession session=request.getSession();
		session.setAttribute("dis", applicant);
		 RequestDispatcher rd=request.getRequestDispatcher("/ApplicationsView.jsp");
		 rd.forward(request, response);
	 
	 }
		
		
		
	}

}
