package com.simple.command;

public class boardVO {
	private String num;
	private String writer;
	private String title;
	private String content;
	private String remark;
	public boardVO() {
		// TODO Auto-generated constructor stub
	}
	public boardVO(String num, String writer, String title, String content, String remark) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.remark = remark;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
