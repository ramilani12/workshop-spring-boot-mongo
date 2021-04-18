package com.nelio.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.workshopmongo.domain.Post;
import com.nelio.workshopmongo.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostResource {
	
	@Autowired
	private PostService postService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable final String id) {
		
		Post post = postService.findById(id);
		
		return ResponseEntity.ok().body(post);
	}
	

}
