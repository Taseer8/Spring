package com.xworkz.powerbank.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PowerBankDto {
	@Value("101")
	private Long powerBankId;
	@Value("Anker 10000")
	private String modelName;

	@Value("chargeable")
	private String batteryType;

	@Value("10000mAh")
	private String capacity;

	@Value("Black")
	private String color;

	@Value("25.99")
	private double price;

	@Value("Available")
	private String status;

}
