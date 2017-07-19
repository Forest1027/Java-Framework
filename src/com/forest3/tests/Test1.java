package com.forest3.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forest3.service.StudentService;

public class Test1 {
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService bean = (StudentService)context.getBean("studentService");
		bean.study();
	}
}
