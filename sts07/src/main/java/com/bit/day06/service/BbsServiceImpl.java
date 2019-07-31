package com.bit.day06.service;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.day06.model.BbsDao;
import com.bit.day06.model.entity.BbsVo;

@Service
public class BbsServiceImpl implements BbsService {
	@Inject
	BbsDao bbsDao;

	@Override
	public void selectAll(Model model) {
		model.addAttribute("alist", bbsDao.selectAll());
	}

	@Override
	public void selectOne(Model model, int num) {
		bbsDao.updateCnt(num);
		model.addAttribute("bean", bbsDao.selectOne(num));
	}

	@Override
	public void add(BbsVo bean) {
		bbsDao.insertOne(bean);
	}


}
