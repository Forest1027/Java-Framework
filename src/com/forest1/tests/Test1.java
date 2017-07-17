package com.forest1.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forest1.beans.Bean1;
import com.forest1.beans.IUserService;
import com.forest1.beans.UserServiceImp;

public class Test1 {
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService bean = (IUserService)context.getBean("userService");
		//bean.provide();
		UserServiceImp uImp = (UserServiceImp)bean;
		System.out.println(uImp.getInfo());
	}
	@Test
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean = (Bean1)context.getBean("bean1");
		bean.bean1();
	}
}
