package com.sck.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sck.dao.ITestDao;

@Repository
public class DaoImpl implements ITestDao {

	@Autowired
	JdbcTemplate jdbcTemp;
	
	@Override
	public void insertRecord() {
		jdbcTemp.update("insert into emp values(1001,'Satheesh',30000,10)");
		jdbcTemp.update("insert into emp values(1002,'Suryan',35000,20)");

	}

	@Override
	public List selectRecords() {
		
		return jdbcTemp.queryForList("select * from emp");
	}

}
