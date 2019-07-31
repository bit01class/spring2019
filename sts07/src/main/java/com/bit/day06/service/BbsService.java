package com.bit.day06.service;

import org.springframework.ui.Model;

import com.bit.day06.model.entity.BbsVo;

public interface BbsService {
	void selectAll(Model model);
	void selectOne(Model model,int num);
	void add(BbsVo bean);
	void update(BbsVo bean);
	void delete(int num);
}
