package com.xowrkz.products.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;



@Component
public class User {
	
	@Autowired
	@Qualifier("lenova")
	private Laptop laptop;
	
	@Autowired
	@Qualifier("windows")
	private OperatingSystem os;
	
	@Autowired
	@Qualifier("vivo")
	private Mobile mobile;

	


}
