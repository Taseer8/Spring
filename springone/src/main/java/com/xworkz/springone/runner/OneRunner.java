package com.xworkz.springone.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OneRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =	
				new AnnotationConfigApplicationContext();
		System.out.println(context.getBeanDefinitionCount());
		String  instance[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));
	}
}
