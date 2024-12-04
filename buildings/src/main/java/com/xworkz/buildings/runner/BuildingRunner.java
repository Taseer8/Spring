package com.xworkz.buildings.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.buildings.dto.BuildingDto;

public class BuildingRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BuildingDto.class);
		Object result = context.getBean(BuildingDto.class);
		System.out.println(result);

	}

}
