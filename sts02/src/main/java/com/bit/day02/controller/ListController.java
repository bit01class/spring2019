package com.bit.day02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day02.model.Day02Dao;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Day02Dao dao=new Day02Dao();
		ModelAndView mav=new ModelAndView();
		mav.addObject("alist", dao.selectAll());
		mav.setViewName("list");
		return mav;
	}

}
