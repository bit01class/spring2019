package com.bit.day05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.day05.model.entity.Day02Vo;

@Controller
public class Form02Controller {
	Logger log=LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/ex12"
			,method = RequestMethod.GET)
	public String get() {
		return "form02";
	}
	
	@RequestMapping(value = "/ex12"
			,method = RequestMethod.POST)
	public void post(@ModelAttribute("bean") Day02Vo vo) {
		vo.setSub("Á¦¸ñ1");
		log.debug(vo.toString());
	}
}










