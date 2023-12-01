package com.oracle.practicecrud1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.practicecrud1.entity.Hr;
import com.oracle.practicecrud1.service.HrService;

@RestController
@RequestMapping("/hr")
public class MyController {
	@Autowired
	HrService service;

	@PostMapping
	public Hr saveHr(@RequestBody Hr hr) {
		return service.saveHr(hr);
	}

	@DeleteMapping("/{id}")
	public void deleteHrbyId(@PathVariable int id) {
		service.deleteHr(id);
	}
	@DeleteMapping("/name/{name}")
	public void deleteHrbyName(@PathVariable String name) {
		service.deleteHr(name);
	}
}
