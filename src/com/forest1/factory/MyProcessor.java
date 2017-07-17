package com.forest1.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(final Object arg0, String arg1) throws BeansException {
		Object proxy = Proxy.newProxyInstance(arg0.getClass().getClassLoader(), arg0.getClass().getInterfaces(),new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object result = null;
				//如果调用的是drive方法，那么就输出语句
				if ("drive".equals(method.getName())) {
					System.out.println("系好安全带");
					result = method.invoke(arg0, args);
				}
				return result;
			}
		});
		return proxy;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("before");
		return null;
	}

}
