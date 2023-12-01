package com.oracle.practicecrud1.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oracle.practicecrud1.entity.Hr;

public interface HrRepository extends JpaRepository<Hr, Integer> {
//	@Query("select x from ")
	void deleteByName(String name);
}
