package com.bit.day07.controller;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.day07.service.BbsService;

@Controller
public class JsonController {
	Logger log=LoggerFactory.getLogger(getClass());
	@Inject
	BbsService bbsService;

	@RequestMapping("/json/list")
	public @ResponseBody List getList() throws SQLException {
		
		return bbsService.list();
	}
}













