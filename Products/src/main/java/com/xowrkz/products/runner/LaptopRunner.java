package com.xowrkz.products.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xowrkz.products.confi.ProductsCofig;
import com.xowrkz.products.dto.User;


public class LaptopRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductsCofig.class);
	System.out.println(	context.getBeanDefinitionCount());
	String[] instance = context.getBeanDefinitionNames();
	
	
	for(String a:instance) {
		System.out.println(a);
	}
	Object res= context.getBean(User.class);
	System.out.println(res);

	}

}
