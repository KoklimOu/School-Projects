package com.tuxglobal.gtipos.repository;

import com.tuxglobal.gtipos.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
    
}
