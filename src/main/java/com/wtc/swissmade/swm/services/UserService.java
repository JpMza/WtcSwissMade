package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.models.User;

import java.util.List;

public interface UserService {

	List<User> getAllUsers();
	
	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);
}
