package com.forest5.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forest5.service.AccountServiceImp;
import com.forest5.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AccountServiceImpTest {
	@Autowired
	private IAccountService service;

	/*public IAccountService getService() {
		return service;
	}

	public void setService(IAccountService service) {
		this.service = service;
	}*/

	@Test
	public void testTransferMoney() {
//		IAccountService service = new AccountServiceImp();
		service.transferMoney("fox", "tom", 500);
	}

}
