package com.bit.day05.model.entity;

import java.sql.Date;

public class Day02Vo {
	private int num;
	private String name,sub,content;
	private Date nalja;
	
	public Day02Vo() {
	}

	public Day02Vo(int num, String name, String sub, String content, Date nalja) {
		super();
		this.num = num;
		this.name = name;
		this.sub = sub;
		this.content = content;
		this.nalja = nalja;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "Day02Vo [num=" + num + ", name=" + name + ", sub=" + sub + ", content=" + content + ", nalja=" + nalja
				+ "]";
	}
	
}
