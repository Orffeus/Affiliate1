package com.affiliate.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.affiliate.common.ExcelReader;
import com.affiliate.entities.Comment;
import com.affiliate.entities.Country;
import com.affiliate.entities.LanguageCode;
import com.affiliate.entities.Place;
import com.affiliate.entities.Region;
import com.affiliate.persistence.PMF;

@SuppressWarnings("serial")
public class AdminControllerServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String uri = req.getRequestURI().toString();
		String url = "/WEB-INF" + uri + ".jsp";	
		
		try {
			req.getRequestDispatcher(url).forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String uri = req.getRequestURI().toString();
		
		try {
			if(uri.equals("/admin/index/fillDatastore"))
				fillDatastore(req, resp);
			else {
				if(uri.equals("/admin/index/clearDatastore"))
					clearDatastore(req, resp);
			}
		} catch (IOException e) {
			System.out.println("It is impossible to redirect");
			e.printStackTrace();
		}
	}

	private void clearDatastore(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query qlc = pm.newQuery(LanguageCode.class);
		Query qc = pm.newQuery(Country.class);
		Query qr = pm.newQuery(Region.class);
		Query qp = pm.newQuery(Place.class);
		
		qlc.deletePersistentAll();
		qc.deletePersistentAll();
		qr.deletePersistentAll();
		qp.deletePersistentAll();
		
		pm.close();
        qlc.closeAll();
        qc.closeAll();
        qr.closeAll();
        qp.closeAll();

		resp.sendRedirect("/admin/index");	
	}

	private void fillDatastore(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query qlc = pm.newQuery(LanguageCode.class);
		Query qc = pm.newQuery(Country.class);
		Query qr = pm.newQuery(Region.class);
		Query qp = pm.newQuery(Place.class);
		
		List<LanguageCode> languageCodes  = new ArrayList<LanguageCode>();
		List<Country> countries  = new ArrayList<Country>();
		List<Region> regions  = new ArrayList<Region>();
		List<Place> places  = new ArrayList<Place>();
					
		ExcelReader er = new ExcelReader();
		
		// first fill language codes
		fillLanguageCodes(er, languageCodes);
		pm.makePersistentAll(languageCodes);
		
		// next read coutries for each country code
		for (LanguageCode lc : languageCodes) {
			fillCountries(er, lc, countries);
		}
		pm.makePersistentAll(countries);
		
		pm.close();
        qlc.closeAll();
        qc.closeAll();
        qr.closeAll();
        qp.closeAll();

		resp.sendRedirect("/admin/index");	
	}

	private void fillCountries(ExcelReader er, LanguageCode lc, List<Country> countries) {		
		String inputFile = getServletConfig().getInitParameter("countryXls") + lc.getLanguageCode() + ".xls";
		er.setInputFile(inputFile);
		try {
			er.readCountries(lc, countries);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("It is not possible to read language codes file.");
		}
	}

	private void fillLanguageCodes(ExcelReader er, List<LanguageCode> languageCodes) {		
		String inputFile = getServletConfig().getInitParameter("languageCodeXls");
		er.setInputFile(inputFile);
		try {
			er.readLanguageCodes(languageCodes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("It is not possible to read countries file.");
		}
	}
}
