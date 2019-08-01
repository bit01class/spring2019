package com.bit.day07.controller;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.day07.model.entity.BbsVo;
import com.bit.day07.service.BbsService;

@Controller
public class JsonController {
	Logger log=LoggerFactory.getLogger(getClass());
	@Inject
	BbsService bbsService;

//	@RequestMapping("/json/list")
	@GetMapping("/json/list")
	public @ResponseBody List getList() throws SQLException {
		
		return bbsService.list();
	}
	
//	@RequestMapping(value = "/json/add"
//			,method = RequestMethod.POST)
	@PostMapping("/json/add")
	public ResponseEntity add(@ModelAttribute BbsVo bean) throws SQLException {
//		log.debug("name:{},sub:{},content:{}"
//					,new Object[] { name,sub,content});
		bbsService.bbsAdd(bean);
		
		ResponseEntity entity=ResponseEntity.status(HttpStatus.OK).body("");
		
		return entity;
	}
}













