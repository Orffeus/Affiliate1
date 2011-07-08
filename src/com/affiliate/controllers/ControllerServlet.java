package com.affiliate.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {        		
		String uri = req.getRequestURI().toString();
		String url = "/WEB-INF" + uri + ".jsp";
		
		if (uri.equals("/views/personsList"))
			try {
				req.getRequestDispatcher(url).forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			if (uri.equals("/views/hello"))
			try {
				req.getRequestDispatcher(url).forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
