package com.softech.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softech.student.model.Student;
import com.softech.student.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("add")
	public String add(Model model) {
		model.addAttribute("student", new Student());
		return "student/saveOrUpdate";
	}
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(Model model, Student student) {
		studentService.save(student);
		model.addAttribute("message", "New student has been saved!");
		return "";
	}
}
