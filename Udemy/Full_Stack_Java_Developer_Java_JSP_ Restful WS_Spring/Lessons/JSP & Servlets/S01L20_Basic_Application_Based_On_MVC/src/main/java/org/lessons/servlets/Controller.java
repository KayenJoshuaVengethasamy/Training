package org.lessons.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param.equals("Login")) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		}else if(param.equals("SignUp")) {
			getServletContext().getRequestDispatcher("/SignUp.jsp").forward(request, response);
		}else if(param.equals("About")) {
			getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
		}else {
			getServletContext().getRequestDispatcher("/NotFound.jsp").forward(request, response);
		}
	}


}
