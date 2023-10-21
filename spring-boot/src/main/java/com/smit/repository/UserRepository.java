package com.smit.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.smit.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
