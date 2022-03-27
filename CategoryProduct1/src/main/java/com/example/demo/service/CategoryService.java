package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Category;
@Component
public interface CategoryService {
	 public Category saveCategory(Category category);

	    public Category findByCaegoryId(int categoryId);
}
