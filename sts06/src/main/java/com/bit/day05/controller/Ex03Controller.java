package com.bit.day05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex03Controller {

	@RequestMapping("/ex03")
	public String ex03() {
		return "ex03";
	}
}
