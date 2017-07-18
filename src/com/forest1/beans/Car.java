package com.forest1.beans;

public class Car{
	private String name;
	private int price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("无参构造");
	}
	

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}


	//@Override
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
