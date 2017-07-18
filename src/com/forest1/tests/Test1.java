package com.forest1.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forest1.beans.Bean1;
import com.forest1.beans.Car;
import com.forest1.beans.IUserService;
import com.forest1.beans.Machine;
import com.forest1.beans.Person;
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
	@Test
	public void test3() {
		//动态代理
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//该步涉及强转，此时getBean获得的已经是代理对象了，如果代理对象没有和被代理对象实现同一个接口，那么此处强转会出现类转换异常
		//因此，被代理对象必须实现一个接口。这样，动态生成的代理也会继承这个接口
		Machine car = (Machine)context.getBean("car1");
		car.drive();
	}
	@Test
	public void test4() {
		//测试构造器注入
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car)context.getBean("car1");
		System.out.println(car.getName()+"..."+car.getPrice());
	}
	@Test
	public void test5() {
		//测试setter注入
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
	}
}
