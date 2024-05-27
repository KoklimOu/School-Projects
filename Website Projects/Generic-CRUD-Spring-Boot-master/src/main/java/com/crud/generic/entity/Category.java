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

@Setter
@Getter

@Entity
@Table(name = "tbl_category")
public class Category extends BaseEntity {

    @Column(name = "cate_name", nullable = false)
    private String cateName;
    @Column(name = "des")
    private String des;
}
