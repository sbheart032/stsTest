package com.example.demo.model;

//import java.util.Date;

public class BoardModel {
	private String id;
	private String name;
	
	public String getId() {
		System.out.println("id : " + id);
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	/*
	 * private int id; private String subject; private String content; private Date
	 * reg_date;
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 * public String getSubject() { return subject; } public void setSubject(String
	 * subject) { this.subject = subject; } public String getContent() { return
	 * content; } public void setContent(String content) { this.content = content; }
	 * public Date getReg_date() { return reg_date; } public void setReg_date(Date
	 * reg_date) { this.reg_date = reg_date; }
	 */
	
	
}
