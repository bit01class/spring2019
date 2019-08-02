package com.bit.day09.aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterExceptionRun implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {
		System.out.println("에러로 끝남");
	}
}
