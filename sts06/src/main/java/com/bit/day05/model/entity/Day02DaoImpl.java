package com.bit.day05.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component(value = "day02Dao")
//@Repository(value = "day02Dao")
public class Day02DaoImpl implements Day02Dao{
//	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Day02Vo> selectAll() {
		String sql="select * from day02";
		return jdbcTemplate.query(sql, new RowMapper<Day02Vo>() {

			@Override
			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Day02Vo(
						rs.getInt("num"),rs.getString("name")
						,rs.getString("sub"),rs.getString("content")
						,rs.getDate("nalja")
						);
			}});
	}

	@Override
	public Day02Vo selectOne(int num) {
		String sql="select * from day02 where num=?";
		return jdbcTemplate.queryForObject(sql
				, new RowMapper<Day02Vo>() {

					@Override
					public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
						return new Day02Vo(
								rs.getInt("num"),rs.getString("name")
								,rs.getString("sub"),rs.getString("content")
								,rs.getDate("nalja")
								);
					}},num);
	}

	@Override
	public void insertOne(Day02Vo bean) {
		String sql="insert into day02 (name,sub,content,nalja) values (?,?,?,now())";
		jdbcTemplate.update(sql, bean.getName()
							,bean.getSub(),bean.getContent());
	}

	@Override
	public int updateOne(Day02Vo bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
