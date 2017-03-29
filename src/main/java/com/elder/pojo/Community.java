package com.elder.pojo;

public class Community {

	private Integer community_id;

	private String name;

	private String address;

	private String phone;

	private String photo;

	public void setCommunity_id(Integer community_id){
		this.community_id = community_id;
	}

	public Integer getCommunity_id(){
		return community_id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setPhoto(String photo){
		this.photo = photo;
	}

	public String getPhoto(){
		return photo;
	}

}