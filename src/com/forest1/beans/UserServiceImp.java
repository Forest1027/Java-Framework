package com.forest1.beans;

public class UserServiceImp implements IUserService{
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void provide() {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImp()......");
	}

}
