package com.bit.day09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day09.model.Day09Dao;

public class Ex01 {

	public static void main(String[] args) {
		ApplicationContext cntxt=null;
		cntxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		Day09Dao day09Dao=(Day09Dao) cntxt.getBean("day09Dao");
		day09Dao.printBean(day09Dao.getBean());
		day09Dao.func1();
		day09Dao.func2();
	}

}
