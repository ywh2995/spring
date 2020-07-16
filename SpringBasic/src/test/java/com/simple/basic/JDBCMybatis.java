package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.test.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")

public class JDBCMybatis {

	@Autowired
	SqlSessionFactoryBean sql;
	
	
	@Autowired
	TestMapper testMapper;
	
	@Test
	public void test() {
		System.out.println(sql);
	}
	
	@Test
	public void test2() {
		String time = testMapper.getTime();
		System.out.println(time);
	}
}
