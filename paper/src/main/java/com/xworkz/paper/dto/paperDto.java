package com.xworkz.paper.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class paperDto {
    @Value("301")
    private Long paperId;

    @Value("A4 Sheet")
    private String modelName;

    @Value("Wood Pulp")
    private String material;

    @Value("210mm x 297mm")
    private String dimensions;

    @Value("White")
    private String color;

    @Value("2.50")
    private double price;

}
