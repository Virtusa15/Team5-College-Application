package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.model.ApplicationStatus;
import com.college.web.service.ApplicantServices;

/**
 * Servlet implementation class ApplicationStatusCheck
 */
public class ApplicationStatusCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationStatusCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter  out=response.getWriter();
		int  aid=Integer.parseInt(request.getParameter("aid"));
		//System.out.println(aid);
		
		ApplicantServices services=new ApplicantServices();
		
		
	ApplicationStatus status=services.getStatus(aid);

	
	if(status==null)
	{
		request.getSession().setAttribute("status", aid);
		response.sendRedirect("NoStatus.jsp");
		
	}
	else
	{
		//System.out.println(aid);
	request.getSession().setAttribute("statusobj",status);
	
	response.sendRedirect("Status.jsp");
		
	}
		
		

		
		
	}

}
