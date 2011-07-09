package com.affiliate.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;


@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {        		
		String uri = req.getRequestURI().toString();
		String url = "/WEB-INF" + uri + ".jsp";
		
		UserService userService = UserServiceFactory.getUserService();

		if (req.getUserPrincipal() != null)
		{
			if (uri.equals("/views/personsList"))
				try {
					req.getRequestDispatcher(url).forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else if (uri.equals("/views/hello")) 
			{
				try {
					req.getRequestDispatcher(url).forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (uri.equals("/views/addComment")) 
			{
				try {
					req.getRequestDispatcher(url).forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				try {
					req.getRequestDispatcher("/WEB-INF/views/notFound.jsp").forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else
		{
			//resp.getWriter().println("<p>"+userService.createLoginURL(uri)+"</p>");
			resp.getWriter().println("<p>Please <a href=\"" +
                    userService.createLoginURL(uri) +
                    "\">sign in</a>.</p>");
			
			//userService.createLoginURL(uri);
			
			/*
			try {
				req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/

		}
		
		
		
		
		
	}
}
