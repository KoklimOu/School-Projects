package com.crud.generic.service.impl;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.Dto.ResponseProduct;
import com.crud.generic.entity.Category;
import com.crud.generic.entity.Product;
import com.crud.generic.repository.CategoryRepository;
import com.crud.generic.repository.ProductRepository;
import com.crud.generic.service.ProductService;
import com.crud.generic.service.generic.impl.ServiceGenericImpl;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl extends ServiceGenericImpl<Product> implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public ResponseDto findOne(Long id) {
        Optional<Product> productRepo = productRepository.findById(id);
        if (!productRepo.isPresent()){
            return new ResponseDto("failed", 0);
        }
        Product product = productRepo.get();
        Optional<Category> categoryOptional = categoryRepository.findById(product.getCategoryId());

        if (categoryOptional.isPresent()){
            Category category = categoryOptional.get();
            ResponseProduct responseProduct = new ResponseProduct(product.getProductName(), product.getPrice(),
                    product.getImage(), category.getCateName(), product.getDiscount(), product.getColor());
            return new ResponseDto("Successful", responseProduct);
        }
        return new ResponseDto("failed", 0);
    }

    @Override
    public ResponseDto findAllByCateId(Long cateId) {
        List<Product> products = productRepository.findAllByCategoryId(cateId);
        if (products.isEmpty()){
            return new ResponseDto("failed", 0);
        }
        return new ResponseDto("successful", products);

    }

    @Override
    public ResponseDto findAllByDiscount() {
        List<Product> discountProduct = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        for (Product product:products) {
            if (product.getDiscount() != null){
                discountProduct.add(product);
            }
        }
        return new ResponseDto("successful", discountProduct);
    }
}
