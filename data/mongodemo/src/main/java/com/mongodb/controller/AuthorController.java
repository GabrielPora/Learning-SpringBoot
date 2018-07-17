package com.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongodb.domain.Author;
import com.mongodb.repository.AuthorRepository;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepository;

	@RequestMapping("/list")
	@ResponseBody
	public Iterable<Author> list(){
		return authorRepository.findAll();
	}
	
}
