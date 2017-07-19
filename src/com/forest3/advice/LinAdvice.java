package com.forest3.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class LinAdvice {
	public Object work(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕前");
		Object result = pjp.proceed();
		System.out.println("环绕后");
		return result;
	}
	public void check() {
		System.out.println("老师检查下");
	}
}
