package com.zensar;

import java.util.List;

public class Item {
	
	
	
	private String name;
	private Double price;
	public Item(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Item() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	

}
