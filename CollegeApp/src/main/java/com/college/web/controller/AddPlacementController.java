package com.college.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.web.model.PlacementDetails;
import com.college.web.service.AdminLoginService;

/**
 * Servlet implementation class AddPlacementController
 */
public class AddPlacementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlacementController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		String cname=request.getParameter("cname");
		String ctc=request.getParameter("ctc");
	
		String company_loction=request.getParameter("cloc");
		String role=request.getParameter("role");
		String event_time=request.getParameter("time");
		
		PlacementDetails p=new PlacementDetails(cname, ctc, company_loction, role, event_time);
		AdminLoginService als=new AdminLoginService();
		boolean result=als.addPlacement(p);
		
		if(result)
		{   
			out.println("<h1 align='center'>placement added sucessfully</h>");
			RequestDispatcher rd=request.getRequestDispatcher("AddPlacements.jsp");
			rd.include(request, response);
			
			
			
		}
		
		
		
		
	}

}
