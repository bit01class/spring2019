package com.bit.day03.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.bit.day03.model.Day02Dao;
import com.bit.day03.model.entity.Day02Vo;

public class UpdateController extends AbstractCommandController {
	private Day02Dao dao;
	
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}
	
	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {
		Day02Vo bean =(Day02Vo) command;
		if(bean.getSub().trim().isEmpty()) {
			ObjectError error=new ObjectError("sub", "제목없음");
			errors.addError(error);
		}
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ModelAndView mav=new ModelAndView();
		Day02Vo bean =(Day02Vo) command;
		mav.setViewName("redirect:detail.bit?idx="+bean.getNum());
		if(errors.hasErrors()) {
			System.out.println(errors.getErrorCount());
			List<ObjectError> errs = errors.getAllErrors();
			System.out.println(errs);
			for(ObjectError err:errs) {
				System.out.println(err.getObjectName());
				System.out.println(err.getDefaultMessage());
			}
			mav.addObject("bean", dao.selectOne(bean.getNum()));
			mav.addObject("msg", false);
			mav.setViewName("detail");
			return mav;
		}
		dao.updateOne(bean );
		return mav;
	}

}









