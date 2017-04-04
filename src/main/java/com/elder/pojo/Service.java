package com.elder.pojo;

public class Service {

	private Integer serviceId;

	private String name;

	private String content;

	private Integer userId;

	private Integer num;

	public void setServiceId(Integer serviceId){
		this.serviceId = serviceId;
	}

	public Integer getServiceId(){
		return serviceId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setNum(Integer num){
		this.num = num;
	}

	public Integer getNum(){
		return num;
	}

}