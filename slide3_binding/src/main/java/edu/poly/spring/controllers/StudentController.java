package edu.poly.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.poly.spring.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public String add(ModelMap model) {
		Student student = new Student();
		student.setStudentId("st01");
		student.setName("tai");
		
		model.addAttribute("student", student);
		return "students/add";
	}
	@RequestMapping(value = "/add" , method = RequestMethod.POST)
	public String save(ModelMap model, Student student) {
		Student stud= new Student();
		model.addAttribute("student", stud);
		return "students/add";
	}
}
