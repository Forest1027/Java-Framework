package com.forest4.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public void study() {
		System.out.println("学习。。。");
	}
	public void sleep() {
		System.out.println("睡觉。。。");
	}
	public void work() {
		System.out.println("敲代码。。。");
	}
}
