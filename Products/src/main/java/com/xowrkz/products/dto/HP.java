package com.xowrkz.products.dto;

import org.springframework.stereotype.Component;

@Component
public class HP implements Laptop {
	public HP() {
		System.out.println("Hp class");
	}

}
