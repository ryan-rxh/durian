package com.durian.dao;

import com.durian.domain.User;

public interface IUserDao {
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public User getUser(String userId);
	public boolean login(String userId, String password);
}
