package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.service.AdminLoginService;

/**
 * Servlet implementation class PlacementDeleteController
 */
public class PlacementDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlacementDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int sno=Integer.parseInt(request.getParameter("sno"));
		System.out.println(sno);
		AdminLoginService service=new AdminLoginService();
		boolean result=service.deletePlacement(sno);
		
		if(result)
		{
			

			RequestDispatcher rd=request.getRequestDispatcher("ViewPlacements.jsp");
			rd.forward(request, response);
		}
		
	}

}
