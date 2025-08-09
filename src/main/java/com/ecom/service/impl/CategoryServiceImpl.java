package com.ecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Category;
import com.ecom.service.CategoryService;
import com.ecomrepository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public Category saveCategory(Category category) {
		return this.categoryRepository.save(category);
		
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> sList = this.categoryRepository.findAll();
		return sList;
	}

}
