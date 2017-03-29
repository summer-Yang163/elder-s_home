package com.elder.pojo;

public class Tip {

	private Integer ti_id;

	private Integer user_id;

	private Integer service_person;

	private String content;

	private Integer isComplete;

	private String comment;

	public void setTi_id(Integer ti_id){
		this.ti_id = ti_id;
	}

	public Integer getTi_id(){
		return ti_id;
	}

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public Integer getUser_id(){
		return user_id;
	}

	public void setService_person(Integer service_person){
		this.service_person = service_person;
	}

	public Integer getService_person(){
		return service_person;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setIsComplete(Integer isComplete){
		this.isComplete = isComplete;
	}

	public Integer getIsComplete(){
		return isComplete;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

}