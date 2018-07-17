package com.queries.repository;

import org.springframework.data.repository.CrudRepository;

import com.queries.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
