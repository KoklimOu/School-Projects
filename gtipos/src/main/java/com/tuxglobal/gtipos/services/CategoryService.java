package com.tuxglobal.gtipos.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.tuxglobal.gtipos.Dto.CategoryDto;
import com.tuxglobal.gtipos.model.Category;
import com.tuxglobal.gtipos.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAllCategory() {
        List<Category> categoriesList = categoryRepository.findAll();
        return categoriesList;
    }

    public Category createCategory(CategoryDto categoryDto) {
        Category category = new Category(UUID.randomUUID().toString(), categoryDto.getName());
        Category categoryAfterSave = categoryRepository.save(category);
        return categoryAfterSave;
    }

    public Category updateCategory(String id, CategoryDto categoryDto) {
        Optional<Category> categoryCategoryOptional = categoryRepository.findById(id);
        Category categoryFromRepo = categoryCategoryOptional.get();

        categoryFromRepo.setName(categoryDto.getName());
        Category categoryAfterSave = categoryRepository.save(categoryFromRepo);

        return categoryAfterSave;
    }
}
