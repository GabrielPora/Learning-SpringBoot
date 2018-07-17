package com.halbrowser.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.halbrowser.domain.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
