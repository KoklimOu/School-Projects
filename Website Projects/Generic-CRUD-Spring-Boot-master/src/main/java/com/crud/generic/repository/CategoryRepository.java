package com.crud.generic.repository;

import com.crud.generic.entity.Category;
import com.crud.generic.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends GenericRepository<Category> {
}
