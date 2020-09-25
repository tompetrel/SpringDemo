package com.softech.shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softech.shop.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String>{
	
}
