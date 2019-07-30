package com.bit.day05.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.day05.model.entity.Day02Dao;
import com.bit.day05.model.entity.Day02Vo;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired
	Day02Dao day02Dao;
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("alist", day02Dao.selectAll());
	}
	
	@RequestMapping(value = "/add"
			, method = RequestMethod.GET)
	public void add() {}
	
	@RequestMapping(value="/add"
			,method = RequestMethod.POST)
	public String add(@ModelAttribute Day02Vo bean) {
		day02Dao.insertOne(bean);
		return "redirect:list";
	}
	
	@RequestMapping("/detail")
	public void one(@RequestParam("idx") int num,Model model) {
		model.addAttribute("bean", day02Dao.selectOne(num));
	}
}























