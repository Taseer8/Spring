package com.xworkz.paper.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.paper.dto.paperDto;

public class PaperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(paperDto.class);
		Object result = context.getBean(paperDto.class);
		System.out.println(result);
	}

}
