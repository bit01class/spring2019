package com.bit.day07.controller;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bit.day07.model.entity.BbsVo;
import com.bit.day07.service.BbsService;

@RestController
public class RestFulController {
	@Inject
	BbsService bbsService;

	@GetMapping("/json/obj")
	public ResponseEntity detail(@RequestParam("idx") int num) throws SQLException {
		ResponseEntity entity=null;
		if(num>0) {
			entity=ResponseEntity
					.status(HttpStatus.OK)
					.body(bbsService.detail(num));
		}else {
			entity=ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body(bbsService.detail(num));
		}
		return entity;	
	}
}














