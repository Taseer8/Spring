package com.xworkz.Computer.dto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComputerDto.class);
		Object result = context.getBean(ComputerDto.class);
		System.out.println(result);
	}

}
