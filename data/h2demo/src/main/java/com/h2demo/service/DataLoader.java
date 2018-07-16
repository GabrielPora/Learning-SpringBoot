package com.h2demo.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2demo.domain.Author;
import com.h2demo.domain.Post;
import com.h2demo.repository.AuthorRepository;
import com.h2demo.repository.PostRepository;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public DataLoader(PostRepository postRepository,AuthorRepository authorRepository){
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void loadData(){
		// create an author
		Author dv = new Author("Gabriel","Groener");
		authorRepository.save(dv);
		
		// create a post
		Post post = new Post("Spring Data Rocks!");
		post.setBody("Post Body here...");
		post.setAuthor(dv);
		postRepository.save(post);
	}
	
}
