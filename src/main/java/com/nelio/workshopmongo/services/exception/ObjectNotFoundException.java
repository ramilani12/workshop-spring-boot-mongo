package com.nelio.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 648226929697916278L;
	
	public ObjectNotFoundException(String message) {
		super(message);
	}

}
