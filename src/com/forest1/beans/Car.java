package com.forest1.beans;

public class Car {
	public Car() {
		System.out.println("无参构造");
	}
	
	public void drive() {
		System.out.println("开车");
	}
	
	public void myInit() {
		System.out.println("创建了");
	}
	public void myDestroy() {
		System.out.println("销毁了");
	}
}
