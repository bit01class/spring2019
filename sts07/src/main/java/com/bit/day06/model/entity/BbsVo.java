package com.bit.day06.model.entity;

import java.sql.Timestamp;

public class BbsVo {
	private int num;
	private String name,sub,content;
	private Timestamp nalja;
	private int cnt;
	
	public BbsVo() {
	}

	public BbsVo(int num, String name, String sub, String content, Timestamp nalja, int cnt) {
		super();
		this.num = num;
		this.name = name;
		this.sub = sub;
		this.content = content;
		this.nalja = nalja;
		this.cnt = cnt;
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

	public Timestamp getNalja() {
		return nalja;
	}

	public void setNalja(Timestamp nalja) {
		this.nalja = nalja;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "BbsVo [num=" + num + ", name=" + name + ", sub=" + sub + ", content=" + content + ", nalja=" + nalja
				+ ", cnt=" + cnt + "]";
	}
	
}
