package com.oracle.practicecrud1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.practicecrud1.dao.HrDao;
import com.oracle.practicecrud1.entity.Hr;

@Service
public class HrService {
	@Autowired
	HrDao dao;

	public Hr saveHr(Hr hr) {
		return dao.saveHr(hr);
	}

	public void deleteHr(int id) {
		dao.deleteHr(id);
	}

	public void deleteHr(String name) {
		dao.deleteHr(name);
	}

}
