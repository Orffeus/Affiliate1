package com.affiliate.manager;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.affiliate.entities.Place;
import com.affiliate.persistence.PMF;

@SuppressWarnings("serial")
public class PlaceManager extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String languageCode = req.getParameter("languageCode");
		String countryCode = req.getParameter("countryCode");
		String regionCode = req.getParameter("regionCode");
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Place.class, "this.languageCode == languageCodeParam && this.countryCode == countryCodeParam" + 
				"&& this.regionCode == regionCodeParam");
		q.declareParameters("String languageCodeParam, String countryCodeParam, String regionCodeParam");
		List<Place> places = (List<Place>) q.execute(languageCode, countryCode, regionCode);
		
		req.setAttribute("places", places);
		String url = "/views/placeSelectDropdown";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
	    pm.close();
	    q.closeAll();
	}
	
}
