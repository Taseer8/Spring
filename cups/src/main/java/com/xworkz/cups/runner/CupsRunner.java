package com.xworkz.cups.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.cups.dto.CupsDto;


public class CupsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CupsDto.class);
		Object result = context.getBean(CupsDto.class);
		System.out.println(result);


	}

}
