package org.lessons.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("Kayen") && password.equals("Love")) {
//			making use of cookies is fine and a user name is fine. However, a cookie needs to be used for giving the user a
//			personalized user experience. Cookies needs to be used to save the users preferences.
//			It should be used in order to implement a login/logout mechanism. It is a common mistake
//			rather use session attribute
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			newSession.setAttribute("username", username);
			response.sendRedirect("memberArea.jsp");

//			invalidating any session if any
//			request.getSession().invalidate();
//			HttpSession newSession = request.getSession(true);
//			newSession.setMaxInactiveInterval(300);
//			adding a cookie to the project
//			Cookie cUsername = new Cookie("username", username);
//			response.addCookie(cUsername);
//			response.sendRedirect("memberArea.jsp");
		}else {
			response.sendRedirect("Login.jsp");
		}

	}

}