package com.affiliate.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Person {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

	@Persistent
	private String firstName;
	
	@Persistent
	private String lastName;
	
	@Persistent
	private String email;
	
	@Persistent
	private Set<Key> comments;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Key getKey() {
		return key;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setComments(List<Comment> comments) {
		this.comments = new HashSet<Key>();
		for (Comment c : comments)
		{
			this.comments.add(c.getKey());
		}
	}

	public Set<Key> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment){
		this.comments.add(comment.getKey());
	}
	
	public void addComments(List<Comment> comments){
		for (Comment c : comments)
		{
			this.comments.add(c.getKey());
		}
	}
}
