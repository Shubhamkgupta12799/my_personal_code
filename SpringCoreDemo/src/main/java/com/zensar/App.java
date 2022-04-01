package com.zensar;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {  
	
		
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
		
		Map<String, Order> map = iocContainer.getBeansOfType(Order.class);
		double total = 0.0;
		for(Entry<String, Order> order:map.entrySet())
		{
			
			 total = total +order.getValue().getItem().getPrice();
		}
		System.out.println("Total Order item price is : - "+total);
//		
//		AbstractApplicationContext iocContainer2 = new FileSystemXmlApplicationContext("c://anand/config/index.txt");
//		
//		Item item1 = (Item) iocContainer.getBean("itemBeans");
//		System.out.println("Items : - "+item1);
		
	// My name is Rahul	
//		
//		Item item1 = (Item) iocContainer.getBean("itemBeans1");
//		System.out.println("Items : - "+item1);
//		
//		Item item2 = (Item) iocContainer.getBean("itemBeans2");
//		System.out.println("Items : - "+item2);
//
//		Order order1 = (Order) iocContainer.getBean("orderBeans1");
//		System.out.println("Items : - "+order1);
//		
//
//		Order order2 = (Order) iocContainer.getBean("orderBeans2");
//		System.out.println("Items : - "+order2);
//		
//		double  total = order1.getItem().getPrice()+order2.getItem().getPrice();
//		
//		System.out.println("Total order items price is : - "+total);
		
		
	}

}
