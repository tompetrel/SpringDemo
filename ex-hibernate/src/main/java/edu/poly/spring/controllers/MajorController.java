package edu.poly.spring.controllers;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import edu.poly.spring.models.Major;

@Controller
public class MajorController {
//	@Autowired
//	private SessionFactory sessionFactory;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@GetMapping("/list")
	@Transactional
	public String list() {
		
		Session session = entityManagerFactory.createEntityManager().unwrap(Session.class);
		String hql = "from Major";
		
		Query<Major> query =  session.createQuery(hql);
		List<Major> list = query.list();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Major major = (Major) iterator.next();
			
			System.out.println("=========Name: "+ major.getName());
		}
		
		return "list";
	}
}
