package org.lessons.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParameterServlet
 */
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ParameterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		this is how to read information being queried in a url e.g 
//		http://localhost:8181/S01L14_Reading_URL_Parameter_s_/ParameterServlet?getValue1=testingParam
//		for one variable
//		response.getWriter().print(request.getParameter("getValue1"));
//		this is an easier way than the above and get multiple
		PrintWriter out = response.getWriter();
		out.println("Value 1 : "+request.getParameter("getValue1"));
		out.println("Value 2 : "+request.getParameter("getValue2"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
