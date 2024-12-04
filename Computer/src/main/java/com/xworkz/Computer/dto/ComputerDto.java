package com.xworkz.Computer.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ComputerDto {

	@Value("101")
	private Long computerId;

	@Value("Dell Inspiron 5400")
	private String modelName;

	@Value("Intel i5")
	private String processor;

	@Value("16GB")
	private String ram;

	@Value("512GB SSD")
	private String storage;

	@Value("Black")
	private String color;

}
