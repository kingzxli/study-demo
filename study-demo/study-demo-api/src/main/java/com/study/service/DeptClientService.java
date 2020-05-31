package com.study.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.study.entity.Dept;

@FeignClient(value = "study-demo-dept")
public interface DeptClientService {

	@GetMapping("/dept/list")
	public List<Dept> list();
	
	@GetMapping("/dept/{id}")
	public Dept findById(@PathVariable("id") String id);
	
	@PostMapping("/dept")
	public void add(Dept dept);
}
