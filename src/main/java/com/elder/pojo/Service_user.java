package com.elder.pojo;

public class Service_user {

	private Integer su_id;

	private Integer service_id;

	private Integer old_id;

	private Integer user_id;

	private Integer comment_rank;

	private String comment;

	private Integer isPay;

	public void setSu_id(Integer su_id){
		this.su_id = su_id;
	}

	public Integer getSu_id(){
		return su_id;
	}

	public void setService_id(Integer service_id){
		this.service_id = service_id;
	}

	public Integer getService_id(){
		return service_id;
	}

	public void setOld_id(Integer old_id){
		this.old_id = old_id;
	}

	public Integer getOld_id(){
		return old_id;
	}

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public Integer getUser_id(){
		return user_id;
	}

	public void setComment_rank(Integer comment_rank){
		this.comment_rank = comment_rank;
	}

	public Integer getComment_rank(){
		return comment_rank;
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