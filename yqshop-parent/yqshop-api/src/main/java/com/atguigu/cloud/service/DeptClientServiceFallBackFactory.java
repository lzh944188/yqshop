package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component	//非常容易忘！！！
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable throwable) {
		
		return new DeptClientService() {
			
			@Override
			public Dept get(Integer deptNo) {
				return new Dept(deptNo, "与"+deptNo+"对应的信息未找到[Consummer]", "数据库不存在");
			}
			
			@Override
			public List<Dept> getAll() {
				return null;
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
	}

}
