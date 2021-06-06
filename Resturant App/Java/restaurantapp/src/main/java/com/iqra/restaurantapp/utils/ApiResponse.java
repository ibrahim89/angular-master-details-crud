package com.iqra.restaurantapp.utils;

import java.util.ArrayList;
import java.util.List;


public class ApiResponse<T>{
	private String message;
	private int messageCode;
	private List<T> list= new ArrayList<>();
	private Object obj;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public ApiResponse(String message, int messageCode) {
		
		this.message = message;
		this.messageCode = messageCode;
	}
	public ApiResponse(String message, int messageCode, List<T> list) {
		
		this.message = message;
		this.messageCode = messageCode;
		this.list = list;
	}
	public ApiResponse(String message, int messageCode, Object obj) {
		
		this.message = message;
		this.messageCode = messageCode;
		this.obj = obj;
	}

	
	

}
