package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Dept;
import com.study.service.DeptClientService;

@RestController
public class DeptController_consumer {
	
	@Autowired
	private DeptClientService service;
	
	@GetMapping("/consumer/dept/list")
	public List<Dept> list(){
		return service.list();
	}
	
	@GetMapping("/consumer/dept/{id}")
	public Dept findById(@PathVariable("id") String id){
		return service.findById(id);
	}
	
	@PostMapping("/consumer/dept")
	public void add(Dept dept) {
		service.add(dept);
	}
	
	
}
