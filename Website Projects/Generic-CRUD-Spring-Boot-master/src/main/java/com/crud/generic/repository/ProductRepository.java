package com.crud.generic.repository;

import com.crud.generic.entity.Product;
import com.crud.generic.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends GenericRepository<Product> {
    List<Product> findAllByCategoryId(Long cateId);
}
