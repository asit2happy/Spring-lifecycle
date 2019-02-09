package com.pack.bean;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object o, String  myBean) {
		System.out.println("post Processer before initialization");
		return o;
	}
	public Object postProcessAfterInitialization(Object o, String myBean) {
		System.out.println("Post processer after initialization.");
		return o;
	}

}
