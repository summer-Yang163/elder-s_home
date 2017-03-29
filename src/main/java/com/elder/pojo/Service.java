package com.elder.pojo;

public class Service {

	private Integer service_id;

	private String name;

	private String content;

	private Integer user_id;

	private Integer num;

	public void setService_id(Integer service_id){
		this.service_id = service_id;
	}

	public Integer getService_id(){
		return service_id;
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

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public Integer getUser_id(){
		return user_id;
	}

	public void setNum(Integer num){
		this.num = num;
	}

	public Integer getNum(){
		return num;
	}

}