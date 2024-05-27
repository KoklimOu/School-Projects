package com.crud.generic.controller;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.controller.generic.ControllerGeneric;
import com.crud.generic.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductController extends ControllerGeneric<Product> {
    ResponseDto findOne(@PathVariable Long id);
    ResponseDto findAllByCateId(@PathVariable Long cateId);
    ResponseDto sortByDiscount();
}
