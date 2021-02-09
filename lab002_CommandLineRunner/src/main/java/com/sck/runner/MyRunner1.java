package com.sck.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sck.bean.HelloBean;

@Order(2)
@Component
public class MyRunner1 implements CommandLineRunner {
	@Autowired
	HelloBean helloBean;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n MyRunner1");
		helloBean.sayHello();

	}

}
