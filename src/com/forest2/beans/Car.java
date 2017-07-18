package com.forest2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car1")
public class Car {
	//@Value("兰博基尼")
	private String name;
	//@Value("1000000000")
	private int price;
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
