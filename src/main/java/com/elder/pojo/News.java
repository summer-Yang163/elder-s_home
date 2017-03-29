package com.elder.pojo;

public class News {

	private Integer news_id;

	private String news_title;

	private String news_content;

	private Integer importent;

	private Integer user_id;

	public void setNews_id(Integer news_id){
		this.news_id = news_id;
	}

	public Integer getNews_id(){
		return news_id;
	}

	public void setNews_title(String news_title){
		this.news_title = news_title;
	}

	public String getNews_title(){
		return news_title;
	}

	public void setNews_content(String news_content){
		this.news_content = news_content;
	}

	public String getNews_content(){
		return news_content;
	}

	public void setImportent(Integer importent){
		this.importent = importent;
	}

	public Integer getImportent(){
		return importent;
	}

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public Integer getUser_id(){
		return user_id;
	}

}