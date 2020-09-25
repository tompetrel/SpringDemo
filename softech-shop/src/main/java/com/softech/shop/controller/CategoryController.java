package com.softech.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softech.shop.model.Category;
import com.softech.shop.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("add")
	public String add() {
		return "categories/saveOrUpdate";
	}

	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Model model, Category category) {
		categoryService.save(category);
		model.addAttribute("message", "New categoru has been saved!");
		return "categories/list";
	}
}
