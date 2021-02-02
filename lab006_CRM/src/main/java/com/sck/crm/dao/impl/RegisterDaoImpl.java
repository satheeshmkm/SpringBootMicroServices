package com.sck.crm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sck.crm.dao.IRegisterDao;
import com.sck.crm.model.CustomerBean;

public class RegisterDaoImpl implements IRegisterDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean saveCustomer(CustomerBean customerBean) {
		int count = jdbcTemplate.queryForObject("select count(*) from customer_tab  where email=?", Integer.class,
				customerBean.getEmail());
		if (count == 1) {
			return false;
		}
		jdbcTemplate.update("insert into customer_tab values(?,?,?,?,?,?,?,?,?)", customerBean.getEmail(),
				customerBean.getFirstName(), customerBean.getLastName(), customerBean.getPassword(),
				customerBean.getGender().toString(), customerBean.getAge(), customerBean.getContactNumber(),
				customerBean.getDateOfBirth(), customerBean.getCountry());
		return true;
	}

}
