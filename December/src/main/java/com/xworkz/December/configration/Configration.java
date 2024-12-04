package com.xworkz.December.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xowrkz")
public class Configration {
	
	public Configration() {
		System.out.println("web init constractor");
	}

}
