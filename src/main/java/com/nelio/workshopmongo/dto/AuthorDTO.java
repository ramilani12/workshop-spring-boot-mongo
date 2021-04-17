package com.nelio.workshopmongo.dto;

import java.io.Serializable;

import com.nelio.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	
	
	private static final long serialVersionUID = -8561442447805716541L;
	private String id;
	private String name;
	
	
	/**
	 * 
	 */
	public AuthorDTO() {
	}
	
	
	public AuthorDTO(User obj) {
		this.id = obj.getId();
		this.name = obj.getName();
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
