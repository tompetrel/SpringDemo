package com.softech.hello.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	@RequestMapping()
	@ResponseBody
	public String welcome() {
		return "welcome spring boot";
	}
	@RequestMapping("default")
	public String defaultOpt() {
		return "default";
	}
	@GetMapping("sayHello")
	public String sayHelloGet() {
		return "sayHello";
	}
	
	@PostMapping("sayHello")
	public String sayHello(Model model , @RequestParam (name="name") String name) {
		model.addAttribute("name", name);
		return "sayHello";
	}
}
