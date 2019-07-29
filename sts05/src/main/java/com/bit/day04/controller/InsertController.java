package com.bit.day04.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.bit.day04.model.Day02Dao;
import com.bit.day04.model.entity.Day02Vo;

public class InsertController extends AbstractCommandController {
	Day02Dao day02Dao;
	
	public void setDay02Dao(Day02Dao day02Dao) {
		this.day02Dao = day02Dao;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		day02Dao.insertOne((Day02Vo)command);
		return new ModelAndView("redirect:list.bit");
	}

}














