package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.model.Admin;
import com.college.web.service.AdminRegService;

/**
 * Servlet implementation class AdminRegController
 */
public class AdminRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("name");
		long aid=Long.parseLong(request.getParameter("aid"));
		String pass=request.getParameter("pass");
		
		Admin admin=new Admin(fname,aid,pass);
		
		try
		{
		AdminRegService adminregservice=new AdminRegService(); 
		
		boolean result=adminregservice.adminRegister(admin);
		out.println("<html>");
        out.println("<head>");      
        out.println("<title>Application Submited Successfully</title>");    
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        if(result){
            out.println("<h1>Ad registred  Sucessfully :</h1>");
            out.println("To login with new AdminId and Password<a href=AdminLogin.html>Click here</a>");
        }
        else{
            out.println("<h1>Registration Failed</h1>");
            out.println("<h1>Admin already exist </h1>");
            out.println("To try again<a href=keyvalidate.html>Click here</a>");
        
         out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    } 
		}
	
        
   finally {
	out.close();
}
		
		
		
		
		
		
	}
}


