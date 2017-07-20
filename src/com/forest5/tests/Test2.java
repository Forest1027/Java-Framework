package com.forest5.tests;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Test2 {
	@Autowired
	private JdbcTemplate jt;
	
	@Test
	public void test1() throws PropertyVetoException {
		//不采用spring ioc的代码
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql:///springtest");
		dataSource.setUser("root");
		dataSource.setPassword("123");
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		template.execute("update t_user set name='lalala' where id=2");
	}
	@Test
	public void test2() {
		jt.execute("update t_user set name='lobby' where id=2");
	}
	@Test
	public void test3() {
		//增删改
		//jt.update("insert into t_user values(null,?,?,?)","jim",18,"女");
		//jt.update("delete from t_user where id=?",1);
		jt.update("update t_user set name=? where id=?","Kara",2);
	}
	@Test
	public void test4() {
		//查询简单结果
		String name = jt.queryForObject("select name from t_user where id=?", String.class,2);
		System.out.println(name);
	}
	
}
