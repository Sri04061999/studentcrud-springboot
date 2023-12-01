package com.oracle.studentcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.studentcrud.entity.Student;

public interface MyRepository extends JpaRepository<Student, Integer> {

	List<Student> findByName(String name);

	List<Student> findByNumber(long number);

}
