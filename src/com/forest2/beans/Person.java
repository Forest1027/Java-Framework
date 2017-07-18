package com.forest2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.forest2.beans.Car;
@Component("p1")
public class Person {
	@Value("Forest")
	private String name;
	@Autowired
	//@Qualifier("car1")
	private Car car;
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
	
}
