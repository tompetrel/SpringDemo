package com.softech.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.softech.student.model.Student;
import com.softech.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public long count() {
		return studentRepository.count();
	}

	@Override
	public void delete(Student arg0) {
		studentRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		studentRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Student> arg0) {
		studentRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(String arg0) {
		studentRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(String arg0) {
		return studentRepository.existsById(arg0);
	}

	@Override
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Iterable<Student> findAllById(Iterable<String> arg0) {
		return studentRepository.findAllById(arg0);
	}

	@Override
	public Optional<Student> findById(String arg0) {
		return studentRepository.findById(arg0);
	}

	@Override
	public <S extends Student> S save(S arg0) {
		return studentRepository.save(arg0);
	}

	@Override
	public <S extends Student> Iterable<S> saveAll(Iterable<S> arg0) {
		return studentRepository.saveAll(arg0);
	}
	
	
}
