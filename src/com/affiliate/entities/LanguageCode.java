package com.affiliate.entities;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class LanguageCode {
		
	@Persistent
	@PrimaryKey
	private String languageCode;

	public LanguageCode(String languageCode) {
		super();
		this.languageCode = languageCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	
}
