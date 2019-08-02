package com.bit.day09.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeRun implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName());
		System.out.println(args[0]);
		System.out.println(target);
	}
}
