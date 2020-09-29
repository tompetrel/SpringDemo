package edu.poly.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.poly.spring.model.Major;
import edu.poly.spring.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@ModelAttribute("majors")
	List<Major> getMajors(){
		List<Major> list = new ArrayList<>();
		Major m1 = new Major(1, "Java");
		Major m2 = new Major(2, "PHP");
		Major m3 = new Major(3, "C#");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;
	}
	
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public String add(ModelMap model) {
		Student student = new Student();
		student.setStudentId("st01");
		student.setName("tai");
		student.setMajorId(1);
		
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
