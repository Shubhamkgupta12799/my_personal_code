package com.zensar.chat;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("chatBeans.xml");
	//	ChatApplication chatApplication = (ChatApplication) iocContainer.getBean(ChatApplication.class);
		
	//	System.out.println(chatApplication);
		
		ChatApplication chatApplication = (ChatApplication) iocContainer.getBean("chatApplicationBean");
    	System.out.println("Items : - "+chatApplication);
	
	}

}
