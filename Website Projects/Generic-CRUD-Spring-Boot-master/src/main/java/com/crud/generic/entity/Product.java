package com.crud.generic.entity;

import com.crud.generic.entity.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
@Table(name = "tbl_product")
public class Product extends BaseEntity {

    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "price")
    private Double price;
    @Column(name = "des")
    private String des;
    @Column(name = "image")
    private String image;
    @Column(name = "category_id", nullable = false)
    private Long categoryId;
    @Column(name = "color")
    private String color;
    @Column(name = "discount")
    private Integer discount;

}
