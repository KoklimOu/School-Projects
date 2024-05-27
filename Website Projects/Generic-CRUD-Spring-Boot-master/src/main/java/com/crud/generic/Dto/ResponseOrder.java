package com.crud.generic.Dto;

import com.crud.generic.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ResponseOrder {
    private Integer amount;
    private Product product;
    private Date orderDate;
}
