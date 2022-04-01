package com.zensar;

public class Order {
	
	private Item item;
	private String title;
	public Order(Item item, String title) {
		super();
		this.item = item;
		this.title = title;
	}
	public Order() {
		super();
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", title=" + title + "]";
	}
	
	

}
