package com.bit.day06.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bit.day06.model.entity.BbsVo;

@Repository
public class BbsDao1Impl implements BbsDao {
	Logger log=LoggerFactory.getLogger(getClass());
	@Inject
	JdbcTemplate jdbcTemplate;

	@Override
	public List<BbsVo> selectAll() {
		String sql="select * from bbs";
		return jdbcTemplate.query(sql
				, new RowMapper<BbsVo>() {

					@Override
					public BbsVo mapRow(ResultSet rs, int rowNum) throws SQLException {
						BbsVo bean =new BbsVo();
						bean.setNum(rs.getInt("num"));
						bean.setName(rs.getString("name"));
						bean.setSub(rs.getString("sub"));
						bean.setContent(rs.getString("content"));
						bean.setNalja(rs.getTimestamp("nalja"));
						bean.setCnt(rs.getInt("cnt"));
						log.debug(bean.toString());
						return bean;
					}
			
		});
	}

}












