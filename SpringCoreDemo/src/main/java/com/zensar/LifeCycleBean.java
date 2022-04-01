package com.zensar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBean implements ApplicationContextAware ,InitializingBean,DisposableBean{

	private double price;

	public LifeCycleBean(double price) {
		super();
		this.price = price;
		System.out.println("Inside default constructor");

	}

	public LifeCycleBean() {
		System.out.println("Inside default constructor");
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifeCycleBean [price=" + price + "]";
	}
	
	public void initialize()
	{
		System.out.println("This is the Initialize  method()");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(applicationContext);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside afterProperties() - "+this.price);
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Destroy method()");
	}
	public void mydestroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside myDestroy method()");
	}
	
	
}
