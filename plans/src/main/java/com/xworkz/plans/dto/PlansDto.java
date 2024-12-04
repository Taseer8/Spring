package com.xworkz.plans.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PlansDto {
    @Value("101")
    private Long planId;

    @Value("Basic Subscription")
    private String planName;

    @Value("Monthly")
    private String duration;

    @Value("Access to basic features")
    private String benefits;

    @Value("10.99")
    private double price;

    @Value("Active")
    private String status;

}
