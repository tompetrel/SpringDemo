package edu.poly.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import edu.poly.spring.model.Company;

@SpringBootApplication
public class Slide5DiApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(Slide5DiApplication.class, args);
	Company company = (Company)context.getBean("company");
	System.out.println("Company:" + company.getName());
		
	}
	
	@Bean(name = "company")
	public Company getCompany() {
		Company comp = new Company();
		
		comp.setName("Fpoly");
		comp.setLogo("Fply");
		
		return comp;
	}
}
