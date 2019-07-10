package com.yq.yqshop.provider.mapper;

import com.atguigu.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//千万记得加这个注解！！！
public interface DeptMapper {
	
	Dept findById(Integer deptNo);
	
	List<Dept> findAll();
	
	boolean addDept(Dept dept);

}
