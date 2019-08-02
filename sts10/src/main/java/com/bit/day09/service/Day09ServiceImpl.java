package com.bit.day09.service;

import java.sql.Date;
import java.sql.SQLException;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.day09.model.Day09Dao;
import com.bit.day09.model.entity.Day09Vo;

@Service
public class Day09ServiceImpl implements Day09Service {
	@Inject
	SqlSession sqlSession;
//	Day09Dao day09Dao;
	
	@Override
	public void getList(Model model) throws SQLException {
//		model.addAttribute("alist", day09Dao.selectAll());
		model.addAttribute("alist"
				, sqlSession.getMapper(Day09Dao.class).selectAll());
	}

	@Override
	public void add(Day09Vo bean) throws SQLException {
//		day09Dao.insertOne(bean);
		bean.setNalja(new Date(System.currentTimeMillis()));
		sqlSession.getMapper(Day09Dao.class).insertOne(bean);
	}

	@Override
	public void edit(Day09Vo bean) throws SQLException {
//		day09Dao.updateOne(bean);
	}

	@Override
	public void delete(int num) throws SQLException {
//		day09Dao.deleteOne(num);
	}

}
