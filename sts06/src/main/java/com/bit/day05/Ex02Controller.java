package com.bit.day05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {

	@RequestMapping("/ex02")
	public String mapping(Model model,HttpServletRequest req, HttpServletResponse resp) {
		return "ex02";
	}
}
