package com.forest2.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forest2.beans.Person;

public class Test1 {
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = (Person)context.getBean("p1");
		System.out.println(bean);
	}
}
