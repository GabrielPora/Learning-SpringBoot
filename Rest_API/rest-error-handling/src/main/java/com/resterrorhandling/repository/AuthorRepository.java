package com.resterrorhandling.repository;

import org.springframework.data.repository.CrudRepository;

import com.resterrorhandling.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
