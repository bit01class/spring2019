package com.bit.day03.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.day03.model.Day02Dao;
import com.bit.day03.model.entity.Day02Vo;

public class InsertController extends AbstractController {
	Day02Dao dao;
	
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		dao.insertOne(new Day02Vo(
				0,request.getParameter("name")
				,request.getParameter("sub")
				,request.getParameter("content"),null
				));
		
		ModelAndView mav =new ModelAndView();
		mav.setViewName("redirect:list.bit");
		return mav;
	}

}
