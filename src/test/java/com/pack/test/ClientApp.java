package com.pack.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		ctx.getBean("myBean");
		
		ctx.registerShutdownHook();

	}

}
