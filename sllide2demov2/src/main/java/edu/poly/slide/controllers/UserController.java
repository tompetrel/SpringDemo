package edu.poly.slide.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.poly.slide.domain.User;

@Controller
@RequestMapping("/users")
public class UserController {
	@GetMapping("/new")
	public String showNew() {
		return "users/addOrEdit";
	}
	@GetMapping("/edit/{username}")
	public String showEdit(@PathVariable("username") String username) {
		return "users/addOrEdit";
	}
	
//	@PostMapping("/saveOrUpdate")
//	public String saveOrUpdate(ModelMap model, 
//			@RequestParam("username") String username,
//			@RequestParam("password") String password){
//		
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		return "users/detail";
//	}
//	@PostMapping("/saveOrUpdate")
//	public String saveOrUpdate(ModelMap model, HttpServletRequest request) {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		return "users/detail";
//	}
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, User user){
		
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		return "users/detail";
	}
}
