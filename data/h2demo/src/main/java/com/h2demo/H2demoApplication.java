package com.h2demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.h2demo.domain.Post;
import com.h2demo.repository.PostRepository;
import com.h2demo.service.DataLoader;

@SpringBootApplication
public class H2demoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

	@Autowired 
	PostRepository postRepository;
	
	@Autowired
	DataLoader dataLoader;
	
    public static void main(String[] args) {
        SpringApplication.run(H2demoApplication.class, args);
    }
    
    @PostConstruct
    void seePosts(){
    	for(Post post : postRepository.findAll() ){
    		logger.info(post.toString());
    	}
    }
    
}
