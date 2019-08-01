package com.bit.day07.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.day07.model.entity.BbsVo;

public interface BbsDao {
	List<BbsVo> selectAll() throws SQLException;
	void InsertOne(BbsVo bean) throws SQLException;
}
