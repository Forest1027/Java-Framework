package com.forest5.dao;

public interface IAccountDao {
	public void accountOut(String outname,double money);
	public void accountIn(String inname,double money);
}
