package com.example.springjwt.service;

import java.util.List;
import java.util.Optional;

import com.example.springjwt.entities.User;

public interface UserService {

	User save(User user);
	List<User> findAll();
	User findOne(String username);
	User findById(Long id);
	void delete(long id);
}
