package study.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.entity.Dept;
import study.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired 
	private DeptService deptService;
	
	@GetMapping("/dept/list")
	public List<Dept> list(){
		return deptService.list();
	}
	
	@GetMapping("/dept/{id}")
	public Dept findById(@PathVariable("id") String id){
		return deptService.get(id);
	}
	
	@PostMapping("/dept")
	public void add(Dept dept) {
		deptService.add(dept);
	}

}
