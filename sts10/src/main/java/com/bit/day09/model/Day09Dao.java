package com.bit.day09.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.day09.model.entity.Day09Vo;

public interface Day09Dao {
	
	List<Day09Vo> selectAll() throws SQLException;
	
	void insertOne(Day09Vo bean) throws SQLException;
	
	int updateOne(Day09Vo bean) throws SQLException;
	
	int deleteOne(int idx) throws SQLException;
}
