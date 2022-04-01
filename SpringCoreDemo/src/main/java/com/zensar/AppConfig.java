package com.zensar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "itemBean10")
	public Item getItemBean1() {
		Item item = new Item("laptop",70000.0);
		return item;
	}
	
	@Bean(name = "itemBean20")
	public Item getItemBean2() {
		Item item = new Item("Desktop",80000.0);
		return item;
	}
}
