package com.xworkz.buildings.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class BuildingDto {
	@Value("345")
	private long apartmentId;
	@Value("taseer villa")
    private String apartmentNumber;
	@Value("7")
    private int numberOfRooms;
	@Value("45.0000")
    private String rentAmount;
	@Value("true")
    private String isAvailable;

}
