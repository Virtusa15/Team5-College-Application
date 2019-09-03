package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.model.Courses;
import com.college.web.service.AdminLoginService;

/**
 * Servlet implementation class CourseAssignController
 */
public class CourseAssignController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseAssignController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
	
 long cid=Long.parseLong(request.getParameter("cid"));
 String cname=request.getParameter("cname");
 String Fname=request.getParameter("fname");
 String Time=request.getParameter("time");
 Courses c=new Courses(cid,cname,Fname,Time);
 PrintWriter out=response.getWriter();
 
 AdminLoginService ad=new AdminLoginService();
 
 boolean result=ad.addCourse(c);
 if(result)
 {
	 out.println("<h3 align='center' color='red'>course added suceessfully</h3>");
	 
	 RequestDispatcher rd=request.getRequestDispatcher("CourseAssign.jsp");
	 rd.include(request, response);
	 
 }
 
 
	
	
	}

}
