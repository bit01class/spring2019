package com.bit.day09;

import java.sql.SQLException;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.day09.model.entity.Day09Vo;
import com.bit.day09.service.Day09Service;

@Controller
public class HomeController {
	@Inject
	Day09Service day09Service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws SQLException {
		day09Service.getList(model);
		return "home";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute Day09Vo bean) throws SQLException {
		day09Service.add(bean);
		return "redirect:/";
	}
	
}



















