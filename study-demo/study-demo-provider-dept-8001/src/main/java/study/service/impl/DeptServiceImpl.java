package study.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.study.entity.Dept;
import study.dao.DeptDao;
import study.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(String id) {		
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {		
		return deptDao.findAll();
	}

}
