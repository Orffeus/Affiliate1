package com.affiliate.entities;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Region {
	
	@PrimaryKey
    @Persistent
    private Key key;
	
	@Persistent
	private String regionCode;
	
	@Persistent
	private String regionName;
	
	@Persistent
	private String countryCode;
	
	@Persistent
	private String languageCode;	

	public Region(String languageCode, String countryCode, String regionCode, String regionName) {
		super();
		this.languageCode = languageCode;
		this.countryCode = countryCode;
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.key = KeyFactory.createKey(Region.class.getSimpleName(), languageCode + "." + countryCode + 
				"." + regionCode);
	}
	
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Key getKey() {
		return key;
	}
}
