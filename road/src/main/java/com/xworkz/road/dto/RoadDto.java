package com.xworkz.road.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class RoadDto {
    @Value("101")
    private Long roadId;

    @Value("Highway 101")
    private String roadName;

    @Value("Asphalt")
    private String surfaceType;

    @Value("5.5 meters")
    private String width;

    @Value("Black")
    private String color;

    @Value("1000.00")
    private double maintenanceCost;

}
