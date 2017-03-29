package com.elder.pojo;

public class Admin {

	private Integer user_id;

	private String name;

	private Integer gender;

	private String phone;

	private String job_num;

	private Integer community_id;

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public Integer getUser_id(){
		return user_id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGender(Integer gender){
		this.gender = gender;
	}

	public Integer getGender(){
		return gender;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setJob_num(String job_num){
		this.job_num = job_num;
	}

	public String getJob_num(){
		return job_num;
	}

	public void setCommunity_id(Integer community_id){
		this.community_id = community_id;
	}

	public Integer getCommunity_id(){
		return community_id;
	}

}