package net.javaguides.springboot.model;

import java.sql.Date;

public class Error2 {

	public Error2(String error, String time, Date date) {
		super();
		this.error = error;
		this.time = time;
		this.date = date;
	}
	String error;
	String time;
	Date date;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Error2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
