package com.forest5.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.forest5.dao.IAccountDao;

public class AccountServiceImp implements IAccountService{
	//@Autowired
	private IAccountDao ad;
	

	public IAccountDao getAd() {
		return ad;
	}


	public void setAd(IAccountDao ad) {
		this.ad = ad;
	}


	@Override
	public void transferMoney(String inname, String outname, double money) {
		//从outname转出钱
		ad.accountIn(inname, money);
		System.out.println(1/0);
		//转钱给inname
		ad.accountOut(outname, money);
	}
}
