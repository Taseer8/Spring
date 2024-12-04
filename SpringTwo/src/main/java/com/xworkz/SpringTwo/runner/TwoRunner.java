package com.xworkz.SpringTwo.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TwoRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =	
				new AnnotationConfigApplicationContext();
		System.out.println(context.getBeanDefinitionCount());
		String  instance[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instance));

	}

}
