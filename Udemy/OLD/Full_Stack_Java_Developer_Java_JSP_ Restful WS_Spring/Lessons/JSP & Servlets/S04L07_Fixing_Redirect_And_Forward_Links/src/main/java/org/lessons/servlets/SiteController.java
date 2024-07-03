package org.lessons.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SiteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "loginSubmit":
			authenticate(request, response);
			break;
		default:
			break;
		}
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		if (username.equals("Kayen") && password.equals("Love")) {
//			request.getSession().invalidate();
//			HttpSession newSession = request.getSession(true);
//			newSession.setMaxInactiveInterval(300);
//			newSession.setAttribute("username", username);
//			response.sendRedirect("memberArea.jsp");
//		} else {
//			response.sendRedirect("login.jsp");
//		}
	}

	public void authenticate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("Kayen") && password.equals("Love")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			newSession.setAttribute("username", username);
//			it is not recommended to redirect to the files directly. If we have a specific URL based on a servlet make use of redirection based on the URL
//			If we do not have the URL for the file, then we make use of forwarding
			response.sendRedirect(request.getContextPath()+"/MemberAreaController?action=memberArea");
		} else {
			response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
		}
	}

}