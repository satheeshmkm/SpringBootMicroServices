package com.sck;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sck.dao.ITestDao;

@SpringBootApplication
public class Lab004Application implements CommandLineRunner{
	@Autowired
	ITestDao dao;

	public static void main(String[] args) {
		SpringApplication.run(Lab004Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dao.insertRecord();
		List employees = dao.selectRecords();
		employees.forEach(emp->System.out.println(emp));
		
		
	}
	

}
