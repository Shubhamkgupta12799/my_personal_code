package com.zensar;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Order implements BeanNameAware , ApplicationContextAware  {
	
	
	
	private Item item;
	private String title;
	public Order(Item item, String title) {
		super();
		this.item = item;
		this.title = title;
	}
	public Order() {
		super();
		System.out.println("This is the default constructor");

	}
	
	public void initialize()
	{
		System.out.println("Addition of 10 and 20 is :  "+(10+20)); // init method use for initialize purpose 
		//Connection dbcon = getConnection();
	}
	
	public void destroy() {
		System.out.println("Subtraction of 20 and 10 is :  "+(20-10)); // detroy is use for destroy purpose 
   //  dbcon,close();
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
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name of Bean is :- "+name);
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(applicationContext);
		
	}
	
	

}
