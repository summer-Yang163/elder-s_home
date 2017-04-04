package com.elder.pojo;

public class Tip {

	private Integer tiId;

	private Integer userId;

	private Integer servicePerson;

	private String content;

	private Integer isComplete;

	private String comment;

	public void setTiId(Integer tiId){
		this.tiId = tiId;
	}

	public Integer getTiId(){
		return tiId;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setServicePerson(Integer servicePerson){
		this.servicePerson = servicePerson;
	}

	public Integer getServicePerson(){
		return servicePerson;
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