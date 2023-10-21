package com.smit.service;

import com.smit.exception.UserException;
import com.smit.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
