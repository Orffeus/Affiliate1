package com.affiliate.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.affiliate.persistence.PMF;
import com.affiliate.entities.Person;
import com.affiliate.entities.Comment;
import com.affiliate.entities.Realty;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import java.util.List;


@SuppressWarnings("serial")
public class SendComment extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        		

		UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();
        
        String ac = req.getParameter("ac");
        String content = req.getParameter("content");
        if (content != null && ac != null && user != null) {
        	//TODO setting comments
        	PersistenceManager pm = PMF.get().getPersistenceManager(); 
        	
        	
        	/**
        	 * Ask to database for user. 
        	 * When user does not exist it makes new one.
        	 */
        	Query q = pm.newQuery(Person.class);
        	q.setFilter("lastName == userLastName");
        	q.declareParameters("String userLastName");
        
        	Person person = null;
        	
        	try {
        		//TODO needs some unique key
				@SuppressWarnings("unchecked")
				List<Person> persons = (List<Person>) q.execute(user.getNickname());
        		person = persons.get(0);
        	} catch (Throwable t) {
    	    	t.printStackTrace();
    	    }
        	       	
        	if (person == null) {
        		person = new Person("Novy", "Novacek");
        		person.setEmail(user.getEmail());
        		pm.makePersistentAll(person);
        	}
        	
        	/**
        	 * Ask to database for realty.
        	 * When this realty is not in database yet, it will add.
        	 */
        	Query q2 = pm.newQuery(Realty.class);
        	q2.setFilter("accommodationCode == accommodationCodeParam");
        	q2.declareParameters("String accommodationCodeParam");
        	
        	Realty realty = null;
        	
        	try {
        		//TODO needs some unique key
				@SuppressWarnings("unchecked")
				List<Realty> realtys = (List<Realty>) q2.execute(ac);
        		realty = realtys.get(0);
        	} catch (Throwable t) {
    	    	t.printStackTrace();
    	    }
        	
        	if (realty == null) {
        		realty = new Realty(ac);
        		pm.makePersistentAll(realty);
        	}
        	
        	
        	//List<Comment> comments = new ArrayList<Comment>();
        	Comment c = new Comment(person.getKey(), realty.getKey() ,content);
        	//comments.add(c);
    		pm.makePersistentAll(c);
    		

	        //TODO redirect back
    		//resp.sendRedirect("/views/result?ac=" + req.getParameter("ac")); 
	        req.setAttribute("ac", ac);
			String url = "/views/addComment";			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(req, resp);
    		//resp.getWriter().println("<p>tohle ale facha?</p>");
			
			pm.close();
	        q.closeAll();
	        q2.closeAll();
        }
        else {
        	resp.getWriter().println("<p>lalala</p>");
        }
	}
	
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        		

		UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();
        
        String ac = req.getParameter("ac");
        String content = req.getParameter("content");
        if (content != null && ac != null && user != null) {
        	//TODO setting comments
        	PersistenceManager pm = PMF.get().getPersistenceManager(); 
        	
        	
        	/**
        	 * Ask to database for user. 
        	 * When user does not exist it makes new one.
        	 */
        	Query q = pm.newQuery(Person.class);
        	q.setFilter("lastName == userLastName");
        	q.declareParameters("String userLastName");
        
        	Person person = null;
        	
        	try {
        		//TODO needs some unique key
				@SuppressWarnings("unchecked")
				List<Person> persons = (List<Person>) q.execute(user.getNickname());
        		person = persons.get(0);
        	} catch (Throwable t) {
    	    	t.printStackTrace();
    	    }
        	       	
        	if (person == null) {
        		person = new Person("Novy", "Novacek");
        		person.setEmail(user.getEmail());
        		pm.makePersistentAll(person);
        	}
        	
        	/**
        	 * Ask to database for realty.
        	 * When this realty is not in database yet, it will add.
        	 */
        	Query q2 = pm.newQuery(Realty.class);
        	q2.setFilter("accommodationCode == accommodationCodeParam");
        	q2.declareParameters("String accommodationCodeParam");
        	
        	Realty realty = null;
        	
        	try {
        		//TODO needs some unique key
				@SuppressWarnings("unchecked")
				List<Realty> realtys = (List<Realty>) q2.execute(ac);
        		realty = realtys.get(0);
        	} catch (Throwable t) {
    	    	t.printStackTrace();
    	    }
        	
        	if (realty == null) {
        		realty = new Realty(ac);
        		pm.makePersistentAll(realty);
        	}
        	
        	
        	//List<Comment> comments = new ArrayList<Comment>();
        	Comment c = new Comment(person.getKey(), realty.getKey() ,content);
        	//comments.add(c);
    		pm.makePersistentAll(c);
    		

	        //TODO redirect back
    		//resp.sendRedirect("/views/result?ac=" + req.getParameter("ac")); 
	        req.setAttribute("ac", ac);
			String url = "/views/addComment";			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(req, resp);
    		//resp.getWriter().println("<p>tohle ale facha?</p>");
			
			pm.close();
	        q.closeAll();
	        q2.closeAll();
        }
        else {
        	resp.getWriter().println("<p>lalala</p>");
        }
	}
	
}