package com.wtc.swissmade.swm.services;

import com.wtc.swissmade.swm.dao.UserDao;
import com.wtc.swissmade.swm.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public List<User> getAllUsers() {
	return userDao.getAllUsers();
	}

	@Transactional
	public void deleteUser(String userId) {
		userDao.deleteUser(userId);
	}
	@Transactional
	public void addUser(User user){
		userDao.addUser(user);
	}
	
	public User getUserById(String userId) {
		return userDao.getUserById(userId);
	}

	
}
