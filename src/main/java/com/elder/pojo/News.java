package com.elder.pojo;

public class News {

	private Integer newsId;

	private String newsTitle;

	private String newsContent;

	private Integer importent;

	private Integer userId;

	public void setNewsId(Integer newsId){
		this.newsId = newsId;
	}

	public Integer getNewsId(){
		return newsId;
	}

	public void setNewsTitle(String newsTitle){
		this.newsTitle = newsTitle;
	}

	public String getNewsTitle(){
		return newsTitle;
	}

	public void setNewsContent(String newsContent){
		this.newsContent = newsContent;
	}

	public String getNewsContent(){
		return newsContent;
	}

	public void setImportent(Integer importent){
		this.importent = importent;
	}

	public Integer getImportent(){
		return importent;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}

}