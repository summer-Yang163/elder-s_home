package com.elder.pojo;

public class User {

	private Integer user_id;

	private String username;

	private String password;

	private Integer type;

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public Integer getUser_id(){
		return user_id;
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