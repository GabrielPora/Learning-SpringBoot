package com.h2demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2demo.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	
	
}
