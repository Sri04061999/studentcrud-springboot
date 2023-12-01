package com.oracle.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.oracle.studentcrud.dao.StudentDao;
import com.oracle.studentcrud.entity.Student;
import com.oracle.studentcrud.helper.ResponceStructure;

@Service
public class MyService {
	@Autowired
	StudentDao dao;

	public Student saveStudent(Student student) {
		return dao.saveStudent(student);
	}

	public ResponceStructure<Student> getStudent(int id) {
		ResponceStructure<Student> structure = new ResponceStructure<Student>();
		structure.setData(dao.getStudent(id));
		return structure;
	}

	public List<Student> getStudent(String name) {
		return dao.getStudent(name);
	}

	public List<Student> getStudent(long number) {
		return dao.getStudent(number);
	}

	public void removeStudent(int id) {
		dao.removeStudent(id);
	}

	public List<Student> getStudent() {
		return dao.getStudent();
	}

	public void removeStudent() {
		dao.removeStudent();
	}

	public Student update(Student student) {
		return dao.update(student);
	}

}
