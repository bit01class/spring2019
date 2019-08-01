package com.bit.day07.service;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bit.day07.model.BbsDao;
import com.bit.day07.model.entity.BbsVo;

@Service
public class BbsServiceImpl implements BbsService {
	@Inject
	BbsDao bbsDao;

	@Override
	public List<BbsVo> list() throws SQLException {
		return bbsDao.selectAll();
	}

	@Override
	public void bbsAdd(BbsVo bean) throws SQLException {
		bbsDao.InsertOne(bean);
	}

}










