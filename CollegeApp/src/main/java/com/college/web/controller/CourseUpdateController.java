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
 * Servlet implementation class CourseUpdateController
 */
public class CourseUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
	long cid=Long.parseLong(request.getParameter("cid"));
	String cname=request.getParameter("cname");
	String fname=request.getParameter("fname");
	String time=request.getParameter("time");
	Courses course=new Courses(cid,cname,fname,time);
	AdminLoginService service=new AdminLoginService();
	
	
	boolean result=service.updateCourse(course);
	if(result)
	{
		out.println("<h1 align='center'>Course Updated Successfully</h1>");
		RequestDispatcher rd=request.getRequestDispatcher("UpdateCourse.jsp");
		rd.include(request, response);
	}
	
		
		
	}

}
