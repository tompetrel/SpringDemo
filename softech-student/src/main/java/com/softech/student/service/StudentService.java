package com.softech.student.service;

import java.util.Optional;

import com.softech.student.model.Student;

public interface StudentService {

	<S extends Student> Iterable<S> saveAll(Iterable<S> arg0);

	<S extends Student> S save(S arg0);

	Optional<Student> findById(String arg0);

	Iterable<Student> findAllById(Iterable<String> arg0);

	Iterable<Student> findAll();

	boolean existsById(String arg0);

	void deleteById(String arg0);

	void deleteAll(Iterable<? extends Student> arg0);

	void deleteAll();

	void delete(Student arg0);

	long count();

}
