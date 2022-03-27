package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
private CategoryRepository categoryRepository;
public Category saveCategory(Category category) {
	List<Product> productList = new ArrayList<>();
	Product product1 = new Product();
	product1.setProductName("ABC");

	Product product2 = new Product();
	product2.setProductName("XYZ");
	
	Product product3 = new Product();
    product3.setProductName("MNC");
    
    productList.add(product1);
    productList.add(product2);;
    productList.add(product3);
    category.setProductList(productList);
    category = categoryRepository.save(category);
    return category;
}

public Category finfByCategoryId(int categoryId) {
	Category category = categoryRepository.findByCategoryId(categoryId);
return category;
}

@Override
public Category findByCaegoryId(int categoryId) {
	// TODO Auto-generated method stub
	return null;
}


}