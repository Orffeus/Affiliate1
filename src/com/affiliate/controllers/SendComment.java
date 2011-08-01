package com.affiliate.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.affiliate.persistence.PMF;
import com.affiliate.entities.Person;
import com.affiliate.entities.Comment;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.mail.Session;

import java.util.List;
import java.util.ArrayList;
import com.google.appengine.api.datastore.KeyFactory;


@SuppressWarnings("serial")
public class SendComment extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {        		

		UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();

        String content = req.getParameter("content");
        if (content != null) {
        	//TODO setting comments
        	PersistenceManager pm = PMF.get().getPersistenceManager();       	
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
        	
        	List<Comment> comments = new ArrayList<Comment>();
        	Comment c = new Comment(person.getKey(), KeyFactory.stringToKey(req.getParameter("id")) ,content);
        	comments.add(c);
    		pm.makePersistentAll(comments);
    		
    		//pm.makePersistentAll(person);
    		pm.close();
	        q.closeAll();

	        //TODO redirect back
    		resp.sendRedirect("/views/result?id=" + req.getParameter("id"));   	
        }
        else {
        	resp.getWriter().println("<p>lalala</p>");
        }
	}
}