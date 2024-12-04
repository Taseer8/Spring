package com.xworkz.cups.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CupsDto {
	
    @Value("201")
    private Long cupId;

    @Value("Ceramic Mug")
    private String modelName;

    @Value("Ceramic")
    private String material;

    @Value("350ml")
    private String capacity;

    @Value("White")
    private String color;

    @Value("150.00")
    private double price;

}
