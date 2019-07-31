package com.bit.day06;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.day06.model.BbsDao;

@Controller
public class BbsController {
	Logger log=LoggerFactory.getLogger(getClass());
	@Inject
	BbsDao bbsDao;

	@RequestMapping("/bbs")
	public String list(Model model) {
		log.debug(bbsDao.selectAll().toString());
		model.addAttribute("alist", bbsDao.selectAll());
		return "bbs/list";
	}
}
