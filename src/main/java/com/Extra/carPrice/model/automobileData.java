package com.Extra.carPrice.model;

public class automobileData {
	
	private	int Id;
	private String title;
	private double price;
	private String link;
	
	public automobileData(int id, String title, double price, String link) {
		super();
		Id = id;
		this.title = title;
		this.price = price;
		this.link = link;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	

}
