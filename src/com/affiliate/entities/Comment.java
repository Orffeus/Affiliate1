package com.affiliate.entities;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Comment {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

	@Persistent
	private String content;

	@Persistent
	private Date date;

	@Persistent
	private Key person;

	@Persistent
	private Key realty;

	public Comment(Key person, Key realty, String content) {
		super();
		this.content = content;
		this.person = person;
		this.realty = realty;
		this.date = new Date();
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Key getKey() {
		return key;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public Key getPerson() {
		return person;
	}

	public void setPerson(Key person) {
		this.person = person;
	}

	public Key getRealty() {
		return realty;
	}

	public void setRealty(Key realty) {
		this.realty = realty;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}