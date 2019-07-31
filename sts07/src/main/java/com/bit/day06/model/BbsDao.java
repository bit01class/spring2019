package com.bit.day06.model;

import java.util.List;

import com.bit.day06.model.entity.BbsVo;

public interface BbsDao {

	List<BbsVo> selectAll();
}
