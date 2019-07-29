package com.bit.day04.model;

import java.util.List;

import com.bit.day04.model.entity.Day02Vo;

public interface Day02Dao {

	List<Day02Vo> selectAll();
	
	Day02Vo selectOne(int num);
	
	void insertOne(Day02Vo bean);
	
	int updateOne(Day02Vo bean);
	
	int deleteOne(int num);
}














