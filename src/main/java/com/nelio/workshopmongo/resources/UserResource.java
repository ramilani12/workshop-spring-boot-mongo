package com.nelio.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.workshopmongo.domain.User;
import com.nelio.workshopmongo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method =  RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = userService.findAll();
		
		return ResponseEntity.ok().body(list);
	}

}
