package com.excelsoft.enties;

import org.springframework.http.HttpStatus;

public class ApiError {
	private String msg;
	private  HttpStatus status;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
}
