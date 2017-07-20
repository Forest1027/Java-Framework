package com.forest5.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forest5.service.AccountServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AccountServiceImpTest {
	@Autowired
	private AccountServiceImp service;

	@Test
	public void testTransferMoney() {
		service.transferMoney("fox", "tom", 500);
	}

}
