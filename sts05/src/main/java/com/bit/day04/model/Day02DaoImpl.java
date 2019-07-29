package com.bit.day04.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.day04.model.entity.Day02Vo;

public class Day02DaoImpl implements Day02Dao {
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Day02Vo> selectAll() {
		String sql="select * from day02";
		RowMapper<Day02Vo> rowMapper=null;
		rowMapper=new RowMapper<Day02Vo>() {

			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Day02Vo(
						rs.getInt("num"),rs.getString("name"),rs.getString("sub")
						,rs.getString("content"),rs.getDate("nalja")
						);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

	public Day02Vo selectOne(int num) {
		String sql="select * from day02 where num=?";
		RowMapper<Day02Vo> rowMapper=null;
		rowMapper=new RowMapper<Day02Vo>() {

			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Day02Vo(
						rs.getInt("num"),rs.getString("name"),rs.getString("sub")
						,rs.getString("content"),rs.getDate("nalja")
						);
			}
		};
		return jdbcTemplate.queryForObject(sql, rowMapper, num);
	}

	public void insertOne(Day02Vo bean) {
		String sql="insert into day02 (name,sub,content,nalja)";
		sql+=" values (?,?,?,now())";
		jdbcTemplate.update(sql, bean.getName(),bean.getSub(),bean.getContent());
	}

	public int updateOne(Day02Vo bean) {
		String sql="update day02 set name=?,sub=?,content=? where num=?";
		return jdbcTemplate.update(sql, bean.getName(),bean.getSub()
										,bean.getContent(),bean.getNum());
	}

	public int deleteOne(int num) {
		String sql="delete from day02 where num=?";
		return jdbcTemplate.update(sql, num);
	}

}








