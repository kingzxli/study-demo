package study.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.entity.Dept;

/**
 * Created by ZeroV on 2018/11/6.
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(String id);

    public List<Dept> findAll();
}
