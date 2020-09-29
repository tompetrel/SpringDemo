package edu.poly.spring.controllers;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ImageController {
	@PostMapping("/upload")
	public String upload(ModelMap model,@RequestParam("image") MultipartFile image) {
		if (image.isEmpty()) {
			model.addAttribute("message", "Please upload an image");
			
		}
		Path path = Paths.get("images");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		return "uploadForm";
	}
}
