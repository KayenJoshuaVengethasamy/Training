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
//			if a browser does not support cookies or has cookies disabled, it can break a website, hence we encode the URL
//			The context path will give us the base URL, such as home URL or domain name. This particular domain name will now be encoded and this will be encoded by attaching a secret sessionID if required
//			This secret sessionID is our own sessionID. The sessionID is kept inside our cookie. If our ID is not inside out cookie, it can be taken from a URL as well if we make use of the encodeURL method.
			
			String encode = response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/MemberAreaController?action=memberArea");
		} else {
			response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
		}
	}

}