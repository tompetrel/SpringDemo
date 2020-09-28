package com.softech.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softech.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
	
}
