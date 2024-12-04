package com.xowrkz.chairs.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChairsDto {
	@Value("45")
    private Long chairId;
	@Value("gf45w")
    private String modelName;
	@Value("wood")
    private String material;
    @Value("brown")
    private String color;
    @Value("1000.00")
    private double price;
    @Value("5")
    private int noOfChairs;

}
