package com.bit.day07.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bit.day07.model.entity.BbsVo;

//@Repository
public class BbsDao1Impl implements BbsDao {
	@Inject
	JdbcTemplate jdbcTemplate;

	@Override
	public List<BbsVo> selectAll() throws SQLException {
		String sql="select * from bbs";
		return jdbcTemplate.query(sql,new RowMapper<BbsVo>() {

			@Override
			public BbsVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				BbsVo bean=new BbsVo();
				bean.setNum(rs.getInt("num"));
				bean.setSub(rs.getString("sub"));
				bean.setName(rs.getString("name"));
				bean.setCnt(rs.getInt("cnt"));
				return bean;
			}
			
		});
	}

	@Override
	public void InsertOne(BbsVo bean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BbsVo selectOne(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
