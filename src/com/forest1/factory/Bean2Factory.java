package com.forest1.factory;

import com.forest1.beans.Bean1;

public class Bean2Factory {
	public Bean1 createBean1() {
		System.out.println("实例工厂");
		return new Bean1("zhangsan");
	}
}
