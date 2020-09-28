package com.softech.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softech.shop.model.Category;
import com.softech.shop.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("view/{id}")
	public String view(Model model, @PathVariable("id") String categoryID) {
		Optional<Category> cate = categoryService.findById(categoryID);
		if (cate.isPresent()) {
			model.addAttribute("category", cate.get());
		}
		return "categories/view";
	}
	@RequestMapping("edit/{id}")
	public String edit(Model model, @PathVariable("id") String categoryID) {
		Optional<Category> cate = categoryService.findById(categoryID);
		if (cate.isPresent()) {
			model.addAttribute("category", cate.get());
		}
		return "categories/saveOrUpdate";
	}
	@RequestMapping("delete/{id}")
	public String delete(Model model, @PathVariable("id") String categoryId) {
		categoryService.deleteById(categoryId);
		
		return "redirect:/category/list";
	}
	@RequestMapping("list")
	public String List(Model model) {
		List<Category> list = (List<Category>) categoryService.findAll();
		model.addAttribute("list", list);
		return "categories/list";
	}

	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("category", new Category());
		return "categories/saveOrUpdate";
	}

	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Model model, Category category) {
		categoryService.save(category);
		model.addAttribute("message", "New categoru has been saved!");
		return "redirect:/category/list";
	}
}
