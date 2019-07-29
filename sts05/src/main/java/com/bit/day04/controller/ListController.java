package com.bit.day04.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day04.model.Day02Dao;

public class ListController implements Controller {
	Day02Dao day02Dao;
	
	public void setDay02Dao(Day02Dao day02Dao) {
		this.day02Dao = day02Dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView("list");
		mav.addObject("alist", day02Dao.selectAll());
		return mav;
	}

}
