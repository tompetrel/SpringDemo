package com.softech.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class calculatorControler {

	@GetMapping
	public String add() {
		return "calculator";
	}

	@PostMapping
	public String add(Model model, @RequestParam(name = "number1") Integer number1,
			@RequestParam(name = "number2") Integer number2) {
		Integer result = number1 + number2;
		model.addAttribute("result", result);
		return "calculator";
	}

}
