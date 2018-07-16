package com.h2demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.h2demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
