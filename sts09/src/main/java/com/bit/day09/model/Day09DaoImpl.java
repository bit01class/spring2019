package com.bit.day09.model;

import com.bit.day09.model.entity.Day09Vo;

public class Day09DaoImpl implements Day09Dao {
	

	@Override
	public Day09Vo getBean() {
		return new Day09Vo();
	}

	@Override
	public void printBean(Day09Vo bean) {
		System.out.println(bean);
	}

	@Override
	public void func1() throws Exception {
		int su=1-1;
		if(su==0) {
		throw new Exception();
		}
	}

	@Override
	public void func2() {
		System.out.println("func2 run...");
	}

}
