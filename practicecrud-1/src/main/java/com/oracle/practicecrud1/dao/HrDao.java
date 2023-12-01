package com.oracle.practicecrud1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.practicecrud1.dao.repository.HrRepository;
import com.oracle.practicecrud1.entity.Hr;

@Repository
public class HrDao {

	@Autowired
	HrRepository repository;

	public Hr saveHr(Hr hr) {
		return repository.save(hr);
	}

	public void deleteHr(int id) {
		repository.deleteById(id);
	}

	public void deleteHr(String name) {
		repository.deleteByName(name);
	}

}
