package com.pack.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.bean.myBean;

public class ClientApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		myBean bin=ctx.getBean("myBean",myBean.class);
		
		bin.display();
		ctx.registerShutdownHook();

	}

}
