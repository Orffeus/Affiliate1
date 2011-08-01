package com.affiliate.controllers;

import java.io.IOException;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.google.appengine.api.users.UserService;
//import com.google.appengine.api.users.UserServiceFactory;


@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {


	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {        		
		String uri = req.getRequestURI().toString();
		String url = "/WEB-INF" + uri + ".jsp";
		String s; // string for loading init parameter of the servlet
		StringTokenizer st; // string tokenizer for s, contains list of variables separated by ','
		boolean urlFound = false;

		//UserService userService = UserServiceFactory.getUserService();	

		//List of pages allowed only for all users
		s = getServletConfig().getInitParameter("publicUriList");
		st = new StringTokenizer(s, ",");
		
		// search in public uri list
		while(st.hasMoreTokens() && !urlFound) {
			if(uri.equals(st.nextToken())) {
				urlFound = true;
				try {
					req.getRequestDispatcher(url).forward(req, resp);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		}
		
		// try restricted uri
		if (!urlFound) {
			s = getServletConfig().getInitParameter("restrictedUriList");
			st = new StringTokenizer(s, ",");	
			
			// search in restricted uri list
			while(st.hasMoreTokens() && !urlFound) {
				if(uri.equals(st.nextToken())) {
					urlFound = true;
					if (req.getUserPrincipal() != null) {
						try {
							req.getRequestDispatcher(url).forward(req, resp);
						} catch (ServletException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else {
						try {
							req.getRequestDispatcher("/views/login").forward(req, resp);
						} catch (ServletException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						/*
						resp.getWriter().println("<p>Please <a href=\"" +
			                    userService.createLoginURL(uri) +
			                    "\">sign in</a>.</p>");
			            */
					}
				}		
			}			
		}
	}
}