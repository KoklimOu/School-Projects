package com.crud.generic.service;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.entity.Product;
import com.crud.generic.service.generic.ServiceGeneric;

import java.util.List;

public interface ProductService extends ServiceGeneric<Product> {
    ResponseDto findOne(Long id);
    ResponseDto findAllByCateId (Long cateId);
    ResponseDto findAllByDiscount();
}
