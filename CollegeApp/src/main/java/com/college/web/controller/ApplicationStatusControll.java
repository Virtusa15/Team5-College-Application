package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.college.web.model.ApplicationStatus;
import com.college.web.service.AdminLoginService;

/**
 * Servlet implementation class ApplicationStatusControll
 */
public class ApplicationStatusControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationStatusControll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     PrintWriter out=response.getWriter();
     response.setContentType("text/html");
		
		int aid=Integer.parseInt(request.getParameter("aid"));
       String name=request.getParameter("aname");
       String status=request.getParameter("status");
       
       ApplicationStatus addStatus=new ApplicationStatus(status,aid,name);
       try
       {
       
               if(status.contentEquals("approve"))
               {
            	AdminLoginService    service=new AdminLoginService();
            
            	
            	
            	boolean result=service.updateStatus(addStatus);
            	
            	
            	if(result)
            	{
            		System.out.println("hi");
            		request.getSession(true);
            		response.sendRedirect("ApplicationsView.jsp");
            	
            		
            	}
          
            	
            	   
               }
               else
               {
            	   
            	   AdminLoginService    service=new AdminLoginService();
               
               	
               	
               	boolean result=service.updateStatus(addStatus);
               	
               	System.out.println(result);
               	
               	if(result)
               	{
              
               		request.getSession(true);
            		response.sendRedirect("ApplicationsView.jsp");
            	
               	}
               
               	   
            	   
               }
       
       
       }
       finally {
    	   
    	   out.close();
       }
	}

}
