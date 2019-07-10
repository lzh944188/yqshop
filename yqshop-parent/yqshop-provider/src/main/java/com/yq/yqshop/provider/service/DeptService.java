package com.yq.yqshop.provider.service;

import com.atguigu.cloud.entities.Dept;

import java.util.List;

public interface DeptService {
	Dept findById(Integer deptNo);

	List<Dept> findAll();

	boolean addDept(Dept dept);
}
