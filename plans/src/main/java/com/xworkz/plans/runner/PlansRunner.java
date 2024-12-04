package com.xworkz.plans.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.plans.dto.PlansDto;

public class PlansRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlansDto.class);
		Object result = context.getBean(PlansDto.class);
		System.out.println(result);

	}

}
