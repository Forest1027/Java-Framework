package com.forest1.factory;

import com.forest1.beans.Bean1;

public class Bean1Factory {
	public static Bean1 createBean1() {
		System.out.println("静态方法");
		return new Bean1("zhangsan");
	}
}
