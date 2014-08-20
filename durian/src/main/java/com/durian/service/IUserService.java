package com.durian.service;

import com.durian.domain.User;

public interface IUserService {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public User getUser(String userId);
	public boolean login(String userId, String password);
}
