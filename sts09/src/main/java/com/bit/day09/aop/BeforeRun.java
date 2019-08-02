package com.bit.day09.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeRun implements MethodBeforeAdvice {
	
	public void before(JoinPoint joinPoint) {
		System.out.println("before run...");
	}
	public void after(JoinPoint joinPoint) {
		System.out.println("after run...");
	}
	
	public void around(ProceedingJoinPoint joinPoint) {
		System.out.println("around before run...");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around after run...");
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName());
		System.out.println(args[0]);
		System.out.println(target);
	}
}
