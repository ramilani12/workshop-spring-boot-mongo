package com.nelio.workshopmongo.dto;

import java.io.Serializable;

import com.nelio.workshopmongo.domain.User;

public class UserDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	
	
	public UserDTO() {
		
	}
	
	public UserDTO(final User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
				
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
