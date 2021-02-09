package com.sck.bean;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
	@Autowired
	ApplicationArguments appArgs;
	public void showArgs() {
		System.out.println(" Non-optional arguments");
		System.out.println(" -------------------");
		List<String> nonOpArgs = appArgs.getNonOptionArgs();
		nonOpArgs.forEach(arg ->System.out.println(arg));
		
		System.out.println(" Optional arguments");
		System.out.println(" -------------------");
		
		Set<String> opArgs =appArgs.getOptionNames();
		/*
		  opArgs.forEach(k-> { System.out.print("key ="+k);
		  System.out.print(", value="+appArgs.getOptionValues(k)); } );
		 */
		opArgs.forEach(k->
		{
			System.out.print("key ="+k);
			appArgs.getOptionValues(k).forEach(v->System.out.print(" ,value="+v));
			System.out.println();
		}
	);
	}

}
