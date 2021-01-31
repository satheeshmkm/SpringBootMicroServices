package com.sck.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sck.bean.HelloBean;

@Component
public class MyRunner2 implements CommandLineRunner {
	
	@Autowired
	HelloBean helloBean;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyRunner2");
		helloBean.sayHello();
	}

}
