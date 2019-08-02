package com.bit.day09.service;

import java.sql.SQLException;

import org.springframework.ui.Model;

import com.bit.day09.model.entity.Day09Vo;

public interface Day09Service {
	void getList(Model model) throws SQLException;
	void add(Day09Vo bean) throws SQLException;
	void edit(Day09Vo bean) throws SQLException;
	void delete(int num) throws SQLException;
}
