package com.bit.day07.service;

import java.sql.SQLException;
import java.util.List;

import com.bit.day07.model.entity.BbsVo;

public interface BbsService {

	List<BbsVo> list() throws SQLException;
	void bbsAdd(BbsVo bean) throws SQLException;
}
