package com.trang.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trang.ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
