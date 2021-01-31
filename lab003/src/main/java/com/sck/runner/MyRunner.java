package com.sck.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sck.bean.ExampleBean;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	ExampleBean exampleBean;

	@Override
	public void run(String... args) throws Exception {
		exampleBean.showArgs();
		
	}
	

}
