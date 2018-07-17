package com.securitysqlandjpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.securitysqlandjpa.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}
