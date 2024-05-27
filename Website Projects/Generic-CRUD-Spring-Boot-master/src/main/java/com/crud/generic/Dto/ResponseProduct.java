package com.crud.generic.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ResponseProduct {
    private String productName;
    private Double price;
    private String image;
    private String cateName;
    private Integer discount;
    private String color;
}
