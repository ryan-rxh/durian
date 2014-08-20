package com.durian.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

abstract class AbstractDao {
	@Autowired
	public HibernateTemplate hibernateTemplate;
}
