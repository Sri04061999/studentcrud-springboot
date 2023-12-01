package com.oracle.studentcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.studentcrud.entity.Student;
import com.oracle.studentcrud.repository.MyRepository;

@Repository
public class StudentDao {
	@Autowired
	MyRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public Student getStudent(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Student> getStudent(String name) {
		return repository.findByName(name);
	}

	public List<Student> getStudent(long number) {
		return repository.findByNumber(number);
	}

	public void removeStudent(int id) {
		repository.deleteById(id);
	}

	public void removeStudent() {
		repository.deleteAll();
	}

	public List<Student> getStudent() {
		return repository.findAll();
	}

	public Student update(Student student) {
		return repository.save(student);
	}
}
