package com.sck.crm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sck.crm.dao.ILoginDao;

public class LoginDaoImpl implements ILoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean loginCheck(String email, String password) {
		int count = jdbcTemplate.queryForObject("select  count(*) from  customer_tab where email=? and password=?", Integer.class, email, password);
		if(count==0) {
			return false;
		}
		return true;
	}

}
