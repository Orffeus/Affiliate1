package com.affiliate.entities;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Place {

	@PrimaryKey
    @Persistent
    private Key key;	
	
	@Persistent
	private String placeCode;
	
	@Persistent
	private String placeName;
	
	@Persistent
	private String languageCode;	
	
	@Persistent
	private String countryCode;
	
	@Persistent
	private String regionCode;	

	public Place(String languageCode, String countryCode, String regionCode, 
			String placeCode, String placeName) {
		super();
		this.placeCode = placeCode;
		this.placeName = placeName;
		this.languageCode = languageCode;
		this.countryCode = countryCode;
		this.regionCode = regionCode;
		this.key = KeyFactory.createKey(Place.class.getSimpleName(), languageCode + "." + countryCode + 
				"." + regionCode + "." + placeCode);
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
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

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getPlaceCode() {
		return placeCode;
	}

	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
}
