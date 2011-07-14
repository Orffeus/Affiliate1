package com.affiliate.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;


@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {        		
		
		//List of pages allowed only for registered users
		List<String> forRegistered = new ArrayList<String>(); 
		forRegistered.add("/views/personsList");
		forRegistered.add("/views/addComment");
		
		//List of pages allowed for each visitor
		List<String> forAnybody = new ArrayList<String>(); 
		forAnybody.add("/views/hello");
		forAnybody.add("/views/login");
		
		String uri = req.getRequestURI().toString();
		String url = "/WEB-INF" + uri + ".jsp";
		
		UserService userService = UserServiceFactory.getUserService();	
		
		if (forRegistered.contains(uri))
		{
			if (req.getUserPrincipal() != null)
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
				resp.getWriter().println("<p>Please <a href=\"" +
	                    userService.createLoginURL(uri) +
	                    "\">sign in</a>.</p>");
			}
		}
		else
		{
			//resp.getWriter().println("<p>hello</p>");
			
			
			if (forAnybody.contains(uri))
			{
				try {
					req.getRequestDispatcher(url).forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		
	}
}
