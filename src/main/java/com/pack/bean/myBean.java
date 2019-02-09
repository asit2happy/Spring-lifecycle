package com.pack.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class myBean implements BeanNameAware,ApplicationContextAware, InitializingBean, DisposableBean{

	private String msg;
	
	public myBean() {
		System.out.println("Object Created.");
	}
	
	public void setMsg(String msg) {
		System.out.println("Dependency injected.");
	}
	
	public void destroy() throws Exception {
		System.out.println("Bean destroy method");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("After property set method");
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println(" Application context aware method called");
	}

	public void setBeanName(String name) {
		
		System.out.println("Bean name aware method called");

	}
	
	public void customInit() {
		System.out.println("Custom intit method called");
	}
	
	public void customDestroy() {
		System.out.println("custom destroy method called");
	}

}
