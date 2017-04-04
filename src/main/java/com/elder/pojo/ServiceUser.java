package com.elder.pojo;

public class ServiceUser {

	private Integer suId;

	private Integer serviceId;

	private Integer oldId;

	private Integer userId;

	private Integer commentRank;

	private String comment;

	private Integer isPay;

	public void setSuId(Integer suId){
		this.suId = suId;
	}

	public Integer getSuId(){
		return suId;
	}

	public void setServiceId(Integer serviceId){
		this.serviceId = serviceId;
	}

	public Integer getServiceId(){
		return serviceId;
	}

	public void setOldId(Integer oldId){
		this.oldId = oldId;
	}

	public Integer getOldId(){
		return oldId;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setCommentRank(Integer commentRank){
		this.commentRank = commentRank;
	}

	public Integer getCommentRank(){
		return commentRank;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setIsPay(Integer isPay){
		this.isPay = isPay;
	}

	public Integer getIsPay(){
		return isPay;
	}

}