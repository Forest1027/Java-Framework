package com.forest5.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImp extends JdbcDaoSupport implements IAccountDao{

	@Override
	public void accountOut(String outname, double money) {
		this.getJdbcTemplate().update("update account set money=money-? where name=?",money,outname);
	}

	@Override
	public void accountIn(String inname, double money) {
		this.getJdbcTemplate().update("update account set money=money+? where name=?",money,inname);
	}
}
