package com.affiliate.entities;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Country {
	
	@PrimaryKey
    @Persistent
    private Key key;
	
	@Persistent
	private String languageCode;	
	
	@Persistent
	private String countryCode;	
	
	@Persistent
	private String countryName;

	public Country(String languageCode, String countryCode, String countryName) {
		super();
		this.languageCode = languageCode;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.setKey(KeyFactory.createKey(Country.class.getSimpleName(), languageCode + "." + countryCode));
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Key getKey() {
		return key;
	}
}
