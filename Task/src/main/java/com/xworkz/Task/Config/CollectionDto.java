package com.xworkz.Task.Config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@ComponentScan("com.xworkz")
public class CollectionDto {
	
	public CollectionDto() {
		// TODO Auto-generated constructor stub
	}
	@Bean
	public Iterable<String> getIterable(){
		System.out.println("from iterable method");
		return new ArrayList();
	}
	@Bean
	public Collection<String> getcollection() {
		System.out.println("from collection method");
		return new ArrayList();
		
	}
	@Bean
	public List getlist() {
		 System.out.println("from list method");
		return new ArrayList();
	}
	@Bean
	public ArrayList getArrayList() {
		System.out.println("from list method");
		return new ArrayList();
		
	}
	@Bean 
	public LinkedList getLinkedList() {
		System.out.println("from linkedList");
		return new LinkedList();
	}
	@Bean
	public Set getSet() {
		System.out.println("from set method");
		return new HashSet();
	}
	@Bean 
	public HashSet getHasset() {
		System.out.println("from hashSet method");
		return new HashSet();
	}
	@Bean
	public LinkedHashSet getLinkedHashSet() {
		System.out.println("from LinkedHashSet method");
		return new LinkedHashSet();
	}
	@Bean 
	public TreeSet getTreeSet() {
		System.out.println("from TreeSet method");
		return new TreeSet();
	}
	@Bean
	public Queue getQueue() {
		System.out.println("from queue method");
		return new PriorityQueue() ;
	}
	@Bean
	public Map getMap() {
		System.out.println("from map method");
		return new HashMap();
	}
	
	@Bean 
	public HashMap getHashMap() {
		System.out.println("from hashMap method");
		return new HashMap();
	}
	@Bean 
	public LinkedHashMap getLinkedHashMap() {
		System.out.println("from LinkedHashMap method");
		return new LinkedHashMap();
	}
	
	
}
