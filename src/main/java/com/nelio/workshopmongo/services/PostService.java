package com.nelio.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelio.workshopmongo.domain.Post;
import com.nelio.workshopmongo.repository.PostRepository;
import com.nelio.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	
	
	public Post findById(final String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(final String title) {
		return postRepository.searchTitle(title);
	}
	
	
	public List<Post> fullSearch(String text , Date minDate , Date maxDate) {
		
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 100);
		
		return postRepository.fullSearch(text, minDate, maxDate);
		
	}

}
