package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@RequestMapping(value = "/savecategory", method = RequestMethod.POST)
	@ResponseBody
	public Category saveCategory(@RequestBody Category category) {
	    Category categoryResponse = categoryService.saveCategory(category);
	    return categoryResponse;
	}
	@RequestMapping(value = "/{categoryId}", method = RequestMethod.GET)
	@ResponseBody
	public Category getCategoryDetails(@PathVariable int categoryId) {
	    Category categoryResponse = categoryService.findByCaegoryId(categoryId);
	    return categoryResponse;
	}	
	}

	

