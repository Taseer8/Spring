package com.xowrkz.dec.Runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WeRunner {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext();
	System.out.println(cont.getBeanDefinitionCount());
	
	String inst[] = cont.getBeanDefinitionNames();
	System.out.println(Arrays.toString(inst));
		

	}

}
