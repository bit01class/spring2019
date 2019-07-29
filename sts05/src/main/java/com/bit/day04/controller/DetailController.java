package com.bit.day04.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day04.model.Day02Dao;

public class DetailController implements Controller{
	Day02Dao day02Dao;
	
	public void setDay02Dao(Day02Dao day02Dao) {
		this.day02Dao = day02Dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num=Integer.parseInt(request.getParameter("idx"));
		return new ModelAndView("detail","bean",day02Dao.selectOne(num));
	}

}















