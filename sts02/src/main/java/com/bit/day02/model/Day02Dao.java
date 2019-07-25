package com.bit.day02.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.day02.model.entity.Day02Vo;

public class Day02Dao {
	
	public Day02Dao() {
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn=null;
		Class.forName("org.gjt.mm.mysql.Driver");
		String url="jdbc:mysql://localhost:3306/xe";
		String user="scott";
		String password="tiger";
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public List<Day02Vo> selectAll() throws ClassNotFoundException, SQLException{
		String sql="SELECT * FROM DAY02 ORDER BY NUM DESC";
		List<Day02Vo> list=new ArrayList<Day02Vo>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Day02Vo bean=new Day02Vo();
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setSub(rs.getString("sub"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
				list.add(bean);
			}
		}finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}

	public void insertOne(Day02Vo bean) throws SQLException, ClassNotFoundException {
		String sql="INSERT INTO DAY02 (NAME,SUB,CONTENT,NALJA) VALUES (?,?,?,NOW())";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getSub());
			pstmt.setString(3, bean.getContent());
			int result=pstmt.executeUpdate();
		}finally {
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		
	}

	public Day02Vo selectOne(int num) throws ClassNotFoundException, SQLException {
		String sql="SELECT * FROM DAY02 WHERE NUM=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next())return new Day02Vo(
					rs.getInt("num"),rs.getString("name")
					,rs.getString("sub"),rs.getString("content")
					,rs.getDate("nalja")
					);
		}finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return null;
	}

}










