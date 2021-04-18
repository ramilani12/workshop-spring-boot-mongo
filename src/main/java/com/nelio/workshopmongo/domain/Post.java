package com.nelio.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nelio.workshopmongo.dto.AuthorDTO;
import com.nelio.workshopmongo.dto.CommentDTO;


@Document
public class Post implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private Date date;
	private String title;
	private String body;
	private AuthorDTO author;
	private List<CommentDTO> comment = new ArrayList<CommentDTO>();
	
	
	public Post() {
		
	}


	public Post(String id, Date date, String title, String body , AuthorDTO author) {
		
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = author;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}
	
	
	/**
	 * @return the author
	 */
	public AuthorDTO getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	


	/**
	 * @return the comment
	 */
	public List<CommentDTO> getComment() {
		return comment;
	}


	/**
	 * @param comment the comment to set
	 */
	public void setComment(List<CommentDTO> comment) {
		this.comment = comment;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		return true;
	}
	
	
	
	
	
	

}
