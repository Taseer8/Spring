package com.xworkz.Task.Runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.Task.Config.CollectionDto;

public class CollectionRunner {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollectionDto.class);
	Object result = context.getBean("getIterable");
	System.out.println(result);
	Object result11 = context.getBean("getcollection");
	System.out.println(result11);
	Object result10 = context.getBean("getlist");
	System.out.println(result10);
	Object result9 = context.getBean("getArrayList");
	System.out.println(result9);
	Object result8 = context.getBean("getLinkedList");
	System.out.println(result8);
	Object result7 = context.getBean("getSet");
	System.out.println(result7);
	Object result6 = context.getBean("getHasset");
	System.out.println(result6);
	Object result5 = context.getBean("getLinkedHashSet");
	System.out.println(result5);
	Object result4 = context.getBean("getTreeSet");
	System.out.println(result4);
	Object result3 = context.getBean("getQueue");
	System.out.println(result3);
	Object result2 = context.getBean("getMap");
	System.out.println(result2);
	Object result1 = context.getBean("getHashMap");
	System.out.println(result1);
	Object result12 = context.getBean("getLinkedHashMap");
	System.out.println(result12);


	}

}
