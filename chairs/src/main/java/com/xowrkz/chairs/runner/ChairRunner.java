package com.xowrkz.chairs.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xowrkz.chairs.dto.ChairsDto;



public class ChairRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ChairsDto.class);
		Object result = context.getBean(ChairsDto.class);
		System.out.println(result);

	}

}
