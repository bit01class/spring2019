package com.bit.day02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day02.model.Day02Dao;
import com.bit.day02.model.entity.Day02Vo;

public class UpdateController implements Controller {

	private Day02Dao dao;
	
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		ModelAndView mav = new ModelAndView();
		
		if(request.getMethod().equals("POST")) {
			Day02Vo bean=new Day02Vo(
					Integer.parseInt(request.getParameter("num"))
					,request.getParameter("name"),request.getParameter("sub")
					,request.getParameter("content"),null
					);
			if(dao.updateOne(bean)>0) {
				mav.setViewName("redirect:detail.bit?idx="+bean.getNum());
			}else {
				mav.addObject("bean", bean);
				mav.setViewName("edit");
			}
		}else {
			mav.setViewName("redirect:/");
		}
		return mav;
	}

}












