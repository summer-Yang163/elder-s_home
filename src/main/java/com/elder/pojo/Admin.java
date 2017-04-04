package com.elder.pojo;

public class Admin {

	private Integer userId;

	private String name;

	private Integer gender;

	private String phone;

	private String jobNum;

	private Integer communityId;

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
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

	public void setJobNum(String jobNum){
		this.jobNum = jobNum;
	}

	public String getJobNum(){
		return jobNum;
	}

	public void setCommunityId(Integer communityId){
		this.communityId = communityId;
	}

	public Integer getCommunityId(){
		return communityId;
	}

}