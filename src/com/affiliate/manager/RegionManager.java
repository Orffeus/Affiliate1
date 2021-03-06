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

import com.affiliate.entities.Region;
import com.affiliate.persistence.PMF;

@SuppressWarnings("serial")
public class RegionManager extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String languageCode = req.getParameter("languageCode");
		String countryCode = req.getParameter("countryCode");
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Region.class, "this.languageCode == languageCodeParam && this.countryCode == countryCodeParam");
		q.declareParameters("String languageCodeParam, String countryCodeParam");
		List<Region> regions = (List<Region>) q.execute(languageCode, countryCode);
		
		req.setAttribute("regions", regions);
		String url = "/views/regionSelectDropdown";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
	    pm.close();
	    q.closeAll();
	}
	
}
