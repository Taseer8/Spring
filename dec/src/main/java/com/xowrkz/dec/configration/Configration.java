package com.xowrkz.dec.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xowrkz")
public class Configration {
	public Configration() {
		System.out.println("ghs");
	}

}
