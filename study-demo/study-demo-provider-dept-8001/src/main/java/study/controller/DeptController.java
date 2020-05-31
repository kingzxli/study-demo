package study.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
	//熔断机制，调用失败会转向调用processHystrix_get方法
	@HystrixCommand(fallbackMethod = "processHystrix_get") 
	public Dept findById(@PathVariable("id") String id){
		Dept dept = deptService.get(id);
		if(dept == null) {
			throw new RuntimeErrorException(null, "该id不存在");
		}
		return dept;
	}
	
	@PostMapping("/dept")
	public void add(Dept dept) {
		deptService.add(dept);
	}
	
	public Dept processHystrix_get(@PathVariable("id") String id) {
		Dept dept = new Dept();
		dept.setId(id);
		dept.setName("name");
		dept.setDbSource("1");
		return dept;
	}

}
