package com.softech.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/students")
public class StudentController {
	@RequestMapping(value =  "/new", method = RequestMethod.GET)
	public String newStudent() {	
		return "students/new";
	}
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String saveStudent() {
		return "students/list";
	}
	
	@RequestMapping("/edit")
	public String editStudent() {
		return "students/edit";
	}
	@RequestMapping(value = "/new", params = "btnDelete", method = RequestMethod.POST)
	public String deleteStudent() {
		return "students/delete";
	}
	
	
	@RequestMapping(value = "/new",params = "btnList", method = RequestMethod.POST)
	public String listStudents() {
		return "students/list";
	}
}
