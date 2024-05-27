package com.crud.generic.controller.impl;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.controller.ProductController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Product;
import com.crud.generic.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product")
public class ProductControllerImpl extends ControllerGenericImpl<Product> implements ProductController {
    private final ProductService productService;

    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    @GetMapping("/find/{id}")
    public ResponseDto findOne(@PathVariable Long id) {
        return this.productService.findOne(id);
    }

    @Override
    @GetMapping("/find-list-product/category-id/{cateId}")
    public ResponseDto findAllByCateId(@PathVariable Long cateId) {
        return this.productService.findAllByCateId(cateId);
    }

    @Override
    @GetMapping("/discount")
    public ResponseDto sortByDiscount() {
        return this.productService.findAllByDiscount();
    }

}
