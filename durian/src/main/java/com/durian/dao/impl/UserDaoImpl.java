package com.durian.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.durian.dao.IUserDao;
import com.durian.domain.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements IUserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String userId) {
		return hibernateTemplate.get(User.class, userId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean login(String userId, String password) {
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("userId", userId));
		dc.add(Restrictions.eq("password", password));
		List<User> uList = hibernateTemplate.findByCriteria(dc);
		boolean result = false;
		if(uList != null && uList.size() > 0){
			result = true;
		}
		return result;
	}

}
