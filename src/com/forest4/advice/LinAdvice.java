package com.forest4.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect//声明bean是一个切面
public class LinAdvice {
	public Object work(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕前");
		Object result = pjp.proceed();
		System.out.println("环绕后");
		return result;
	}
	//前置通知
	@Before("execution(* com.forest4.service.StudentService.study(..))")
	public void check() {
		System.out.println("老师检查下");
	}
}
