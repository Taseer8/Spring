package com.xworkz.powerbank.runner;

import javax.sound.midi.Soundbank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.powerbank.dto.PowerBankDto;

public class PowerBankRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PowerBankDto.class);
		Object  result  = context.getBean(PowerBankDto.class);
		System.out.println(result);
	}

}
