package study.service;

import java.util.List;

import com.study.entity.Dept;

public interface DeptService {
	
	public boolean add(Dept dept);
	
	public Dept get(String id);
	
	public List<Dept> list();

}
