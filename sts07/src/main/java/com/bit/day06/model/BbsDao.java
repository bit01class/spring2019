package com.bit.day06.model;

import java.util.List;

import com.bit.day06.model.entity.BbsVo;

public interface BbsDao {

	List<BbsVo> selectAll();
	BbsVo selectOne(int num);
	void insertOne(BbsVo bean);
	int updateCnt(int num);
	int updateOne(BbsVo bean);
	int deleteOne(int num);
}
