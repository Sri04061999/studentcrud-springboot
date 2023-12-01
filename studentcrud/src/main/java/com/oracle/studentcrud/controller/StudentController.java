package com.oracle.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.studentcrud.entity.Student;
import com.oracle.studentcrud.helper.ResponceStructure;
import com.oracle.studentcrud.service.MyService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	MyService myService;

	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return myService.saveStudent(student);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponceStructure<Student>> getStudent(@PathVariable int id) {
		return new ResponseEntity<ResponceStructure<Student>>(myService.getStudent(id), HttpStatus.FOUND);
	}

	@GetMapping()
	public List<Student> getStudent() {
		return myService.getStudent();
	}

	@GetMapping("/name/{name}")
	public List<Student> getStudent(@PathVariable String name) {
		return myService.getStudent(name);
	}

	@GetMapping("/number/{number}")
	public List<Student> getStudent(@PathVariable long number) {
		return myService.getStudent(number);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		myService.removeStudent(id);
	}

	@DeleteMapping
	public void deleteStudent() {
		myService.removeStudent();
	}

	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return myService.update(student);
	}

}
