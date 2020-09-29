package edu.poly.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.spring.model.Company;

@Controller
public class CompanyController {
	
	@Autowired
	Company comp;
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Company in Controller: "+ comp.getName());
		return "index";
	}
}
