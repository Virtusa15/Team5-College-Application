package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.service.KeyService;

/**
 * Servlet implementation class KeyController
 */
public class KeyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
  response.setContentType("text/html;charset=UTF-8");
		  
		  PrintWriter out=response.getWriter(); 
		  //response.setContentType("text/html;charset=UTF-8");
		  
		 
		
		KeyService keyservice=new KeyService();
		String Key=request.getParameter("key");
		
		boolean result=keyservice.validate(Key);
		System.out.println(result+"from keyservice");
        if(result)
        {
      	RequestDispatcher rd=request.getRequestDispatcher("AdminReg.html");
       	rd.forward(request, response);
        	//response.sendRedirect("AdminLogin.html");
        	
        }
        else
        {
        	out.println("please enter valid key");
        	RequestDispatcher rd=request.getRequestDispatcher("keyvalidate.html");
        	rd.include(request, response);
        }
        
        
		
		
	}

}
