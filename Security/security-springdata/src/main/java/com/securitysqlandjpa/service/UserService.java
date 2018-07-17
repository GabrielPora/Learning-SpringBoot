package com.securitysqlandjpa.service;

import com.securitysqlandjpa.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}
