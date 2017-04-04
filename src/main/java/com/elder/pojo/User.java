package com.elder.pojo;

public class User {

	private Integer userId;

	private String username;

	private String password;

	private Integer type;

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setType(Integer type){
		this.type = type;
	}

	public Integer getType(){
		return type;
	}

}