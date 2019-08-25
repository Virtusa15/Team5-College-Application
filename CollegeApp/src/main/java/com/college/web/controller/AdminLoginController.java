package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.service.AdminLoginService;

/**
 * Servlet implementation class AdminLoginController
 */
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
response.setContentType("text/html");
String aid=request.getParameter("aid");
String name=request.getParameter("name");

String password=request.getParameter("pass");

AdminLoginService loginservice=new AdminLoginService();
boolean result=loginservice.authenticateAdmin(aid,password);
if(result == true){
    request.getSession().setAttribute("user", name);      
    response.sendRedirect("Adminhome.jsp");
}
else{
    response.sendRedirect("error.jsp");
}



		
		
		
		
		
	}

}
